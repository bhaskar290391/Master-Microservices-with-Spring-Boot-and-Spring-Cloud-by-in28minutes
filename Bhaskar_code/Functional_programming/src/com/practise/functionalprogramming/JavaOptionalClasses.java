package com.practise.functionalprogramming;

import java.util.List;
import java.util.Optional;

public class JavaOptionalClasses {
	public static void main(String[] args) {

		List<String> fruits = List.of("Apple", "Banana", "mango");

		// Optional<String> data = fruits.stream().filter(fruit->
		// fruit.startsWith("B")).findFirst();
		Optional<String> data = fruits.stream().filter(fruit -> fruit.startsWith("C")).findFirst();

		System.out.println(data);
		System.out.println(data.isEmpty());
		System.out.println(data.isPresent());
		System.out.println(data.get());
	}
}
