package com.practise.rest.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.rest.webservice.dao.UserRepository;
import com.practise.rest.webservice.entity.Users;

@Service
public class UserJPAService {

	@Autowired
	private UserRepository repository;

	public List<Users> findAll() {
		return repository.findAll();
	}

	public Optional<Users> findById(long id) {
		Optional<Users> userData = repository.findById(id);
		return userData;
	}

	public Users saveUser(Users users) {
		return repository.save(users);
	}

	public void deleteUsers(long id) {
		repository.deleteById(id);
	}
}
