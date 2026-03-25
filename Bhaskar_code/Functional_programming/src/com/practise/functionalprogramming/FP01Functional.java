package com.practise.functionalprogramming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		printAllNumberFromListFunctional(List.of(24, 23, 12, 4, 25, 19, 4, 5, 7, 87, 18, 12));

	}

	private static void printAllNumberFromListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

	}

}
