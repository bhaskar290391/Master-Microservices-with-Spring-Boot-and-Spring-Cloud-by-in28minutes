package com.practise.rest.webservice.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practise.rest.webservice.entity.Users;

@Service
public class UserService {

	private static List<Users> usersData = new ArrayList<>();

	static {
		usersData.add(new Users(1, "Bhaskar", LocalDate.now().minusYears(30)));
		usersData.add(new Users(2, "Sammy", LocalDate.now().minusYears(14)));
		usersData.add(new Users(3, "kanishk", LocalDate.now().minusYears(20)));
	}

	public List<Users> findAll() {
		return usersData;
	}

	public Users findById(int id) {
		return usersData.stream().filter(user -> user.getId() == id).findFirst().get();
	}
}
