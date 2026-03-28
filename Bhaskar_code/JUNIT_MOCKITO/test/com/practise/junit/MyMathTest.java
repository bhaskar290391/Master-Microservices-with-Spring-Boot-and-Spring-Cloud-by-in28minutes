package com.practise.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath test = new MyMath();

	@Test
	void calculateSum_ThreeMembersArrays() {

		assertEquals(6, test.calculateSum(new int[] { 1, 2, 3 }));
	}

	@Test
	void calculateSum_ZeroMembersArrays() {

		assertEquals(0, test.calculateSum(new int[] {  }));
	}
}
