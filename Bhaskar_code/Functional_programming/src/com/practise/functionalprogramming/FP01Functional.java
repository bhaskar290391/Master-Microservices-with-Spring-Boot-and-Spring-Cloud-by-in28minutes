package com.practise.functionalprogramming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(24, 23, 12, 4, 25, 19, 4, 5, 7, 87, 18, 12);
	//	printAllNumberFromListFunctional(numbers);
		printAllEvenNumberFromListFunctional(numbers);

	}

	private static void printAllEvenNumberFromListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

	private static void printAllNumberFromListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

	}

}
