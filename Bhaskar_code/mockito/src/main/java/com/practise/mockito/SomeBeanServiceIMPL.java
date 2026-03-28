package com.practise.mockito;

public class SomeBeanServiceIMPL {

	public DateService service;

	public int findGreatestValueFromArray() {
		int[] data = service.retrieveData();

		int greatestValue = Integer.MIN_VALUE;

		for (int number : data) {
			if (number > greatestValue) {
				greatestValue = number;
			}
		}
		return greatestValue;
	}
}
