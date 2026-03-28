package com.practise.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MyAssertTest {
 private List<String> todo=Arrays.asList("AWS","Azure","GCP");
 
 @Test
	void assertDataTest() {

		assertTrue(todo.contains("AWS"));
		assertFalse(todo.contains("JAVA"));
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
		assertEquals(3, todo.size());
	}
}
