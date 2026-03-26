package com.practise.functionalprogramming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(24, 23, 12, 4, 25, 19, 4, 5, 7, 87, 18, 12);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		// printAllNumberFromListFunctional(numbers);
		// printAllEvenNumberFromListFunctional(numbers);
		
		//printSquareEvenNumberFromListFunctional(numbers);
		
		//printSquareOddNumberFromListFunctional(numbers);

		// numbers.stream().filter(number -> number % 2 !=
		// 0).forEach(System.out::println);

		// courses.stream().forEach(System.out::println);
		
		//courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

		//courses.stream().filter(course -> course.length() > 4).forEach(System.out::println);
		
		courses.stream().map(course -> course+" "+course.length()).forEach(System.out::println);

	}

	private static void printSquareOddNumberFromListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 !=0).map(number -> number * number).forEach(System.out::println);
		
		
	}

	private static void printSquareEvenNumberFromListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2==0).map(number -> number * number).forEach(System.out::println);
		
	}

	private static void printAllEvenNumberFromListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

	private static void printAllNumberFromListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

	}

}
