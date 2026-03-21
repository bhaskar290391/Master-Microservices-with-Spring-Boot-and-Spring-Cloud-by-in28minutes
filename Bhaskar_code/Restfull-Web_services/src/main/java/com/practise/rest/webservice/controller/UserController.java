package com.practise.rest.webservice.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.rest.webservice.entity.Users;
import com.practise.rest.webservice.service.UserService;

@RestController
public class UserController {

	private UserService service;

	@Autowired
	public UserController(UserService service) {

		this.service = service;
	}
	
	@GetMapping("/users")
	public List<Users> retrieveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Users retrieveUserById(@PathVariable int id){
		return service.findById(id);
	}

}
