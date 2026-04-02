package com.practise.learning_spring_framework.games.repo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataRepository {

	public int calculateSum() {
		List<Integer> data = List.of(10, 20, 30, 40);
		return data.stream().reduce(0, Integer::sum);
	}

}
