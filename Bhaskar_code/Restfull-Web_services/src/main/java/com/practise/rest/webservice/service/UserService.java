package com.practise.rest.webservice.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.practise.rest.webservice.entity.Users;

@Service
public class UserService {

	private static List<Users> usersData = new ArrayList<>();

	private static int userCount = 0;

	static {
		usersData.add(new Users(++userCount, "Bhaskar", LocalDate.now().minusYears(30)));
		usersData.add(new Users(++userCount, "Sammy", LocalDate.now().minusYears(14)));
		usersData.add(new Users(++userCount, "kanishk", LocalDate.now().minusYears(20)));
	}

	public List<Users> findAll() {
		return usersData;
	}

	public Users findById(int id) {
		return usersData.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}

	public Users saveUser(Users users) {
		users.setId(++userCount);
		usersData.add(users);
		return users;
	}

	public void deleteUsers(int id) {
		Predicate<? super Users> predicate = user -> user.getId() == id;
		usersData.removeIf(predicate);
	}
}
