package com.practise.rest.webservice.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practise.rest.webservice.entity.Posts;
import com.practise.rest.webservice.entity.Users;
import com.practise.rest.webservice.exception.UserNotFoundException;
import com.practise.rest.webservice.service.UserJPAService;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import jakarta.validation.Valid;

@RestController
public class UserController {

	private UserJPAService service;

	@Autowired
	public UserController(UserJPAService service) {
		this.service = service;
	}

	@GetMapping("/users")
	public List<Users> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public EntityModel<Users> retrieveUserById(@PathVariable long id) {
		Users users = service.findById(id).get();

		if (users == null) {
			throw new UserNotFoundException("Id ::: " + id);
		}

		EntityModel<Users> entityModel = EntityModel.of(users);

		WebMvcLinkBuilder builder = linkTo(methodOn(this.getClass()).retrieveAllUsers());

		entityModel.add(builder.withRel("all-users"));

		return entityModel;
	}

	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable long id) {
		Optional<Users> users = service.findById(id);

		if (users.isEmpty()) {
			throw new UserNotFoundException("Id ::: " + id);
		}

		service.deleteUsers(id);
	}

	@PostMapping("/users")
	public ResponseEntity<Users> createUsers(@Valid @RequestBody Users user) {

		Users savedUser = service.saveUser(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/users/{id}/posts")
	public List<Posts> retrievePostByUserId(@PathVariable long id) {
		Optional<Users> users = service.findById(id);

		if (users.isEmpty()) {
			throw new UserNotFoundException("Id ::: " + id);
		}

		return users.get().getPosts();
	}

	@PostMapping("/users/{id}/posts")
	public ResponseEntity<Posts> createPostForParticularUser(@PathVariable long id, @Valid @RequestBody Posts posts) {

		Optional<Users> users = service.findById(id);

		if (users.isEmpty()) {
			throw new UserNotFoundException("Id ::: " + id);
		}

		Posts savePost = service.savePost(posts);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savePost.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

}
