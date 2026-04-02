package com.practise.learning_spring_framework.games.service;

import org.springframework.stereotype.Component;

import com.practise.learning_spring_framework.games.repo.DataRepository;

@Component
public class Dataservice {

	private DataRepository repository;

	public Dataservice(DataRepository repository) {
		super();
		this.repository = repository;
	}

	public int calculateSum() {
		
		return repository.calculateSum();
	}
	
	
	
}
