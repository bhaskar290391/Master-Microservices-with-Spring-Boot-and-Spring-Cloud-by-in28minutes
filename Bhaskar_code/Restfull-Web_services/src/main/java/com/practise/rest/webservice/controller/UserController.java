package com.practise.rest.webservice.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practise.rest.webservice.entity.Users;
import com.practise.rest.webservice.exception.UserNotFoundException;
import com.practise.rest.webservice.service.UserService;

@RestController
public class UserController {

	private UserService service;

	@Autowired
	public UserController(UserService service) {

		this.service = service;
	}

	@GetMapping("/users")
	public List<Users> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public Users retrieveUserById(@PathVariable int id) {
		Users users = service.findById(id);

		if (users == null) {
			throw new UserNotFoundException("Id ::: " + id);
		}

		return users;
	}

	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		Users users = service.findById(id);

		if (users == null) {
			throw new UserNotFoundException("Id ::: " + id);
		}

		service.deleteUsers(id);
	}

	@PostMapping("/users")
	public ResponseEntity<Users> createUsers(@RequestBody Users user) {

		Users savedUser = service.saveUser(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

}
