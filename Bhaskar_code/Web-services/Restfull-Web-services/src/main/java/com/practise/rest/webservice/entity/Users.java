package com.practise.rest.webservice.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user_details")
public class Users {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Size(min = 2, message = "Atleast two characters")
	@Column(name = "name")
	private String name;

	@Past(message = "Birthdate should be past")
	@Column(name = "birth_date")
	private LocalDate birthDate;

	@OneToMany(mappedBy = "users")
	@JsonIgnore
	private List<Posts> posts;

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

	public Users() {

	}

	public List<Posts> getPosts() {
		return posts;
	}

	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}

}
