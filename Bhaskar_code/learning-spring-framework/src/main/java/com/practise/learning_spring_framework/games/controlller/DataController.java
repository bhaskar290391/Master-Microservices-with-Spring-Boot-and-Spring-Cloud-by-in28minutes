package com.practise.learning_spring_framework.games.controlller;

import org.springframework.stereotype.Component;

import com.practise.learning_spring_framework.games.service.Dataservice;

@Component
public class DataController {

	private Dataservice service;

	public DataController(Dataservice service) {
		super();
		this.service = service;
	}
	
	
	public int getcalculatedSum() {
		return service.calculateSum();
	}
}
