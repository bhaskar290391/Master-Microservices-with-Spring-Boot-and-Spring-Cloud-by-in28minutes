package com.practise.functionalprogramming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		printAllNumberFromListStructured(List.of(24, 23, 12, 4, 25, 19, 4, 5, 7, 87, 18, 12));

	}

	private static void printAllNumberFromListStructured(List<Integer> numbers) {

		for (Integer integer : numbers) {
			System.out.println(integer);
		}

	}

}
