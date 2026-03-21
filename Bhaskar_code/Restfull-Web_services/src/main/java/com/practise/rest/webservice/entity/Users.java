package com.practise.rest.webservice.entity;

import java.time.LocalDate;

public class Users {

	private long id;
	private String name;
	private LocalDate birthDate;

	public Users(long id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Users [Id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
