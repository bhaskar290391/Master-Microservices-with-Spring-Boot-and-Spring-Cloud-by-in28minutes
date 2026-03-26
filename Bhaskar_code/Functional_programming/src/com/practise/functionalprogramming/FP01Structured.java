package com.practise.functionalprogramming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(24, 23, 12, 4, 25, 19, 4, 5, 7, 87, 18, 12);
		//printAllNumberFromListStructured(numbers);
		printAlEvenNumberFromListStructured(numbers);

	}

	private static void printAlEvenNumberFromListStructured(List<Integer> numbers) {
		for (Integer integer : numbers) {
			if (integer % 2 == 0) {
				System.out.println(integer);
			}

		}

	}

	private static void printAllNumberFromListStructured(List<Integer> numbers) {

		for (Integer integer : numbers) {
			System.out.println(integer);
		}

	}

}
