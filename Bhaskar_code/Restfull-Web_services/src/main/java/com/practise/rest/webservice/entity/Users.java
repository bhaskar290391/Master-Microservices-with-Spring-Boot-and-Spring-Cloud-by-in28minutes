package com.practise.rest.webservice.entity;

import java.time.LocalDate;

public class Users {

	private long Id;
	private String name;
	private LocalDate birthDate;

	public Users(long id, String name, LocalDate birthDate) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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
		return "Users [Id=" + Id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
