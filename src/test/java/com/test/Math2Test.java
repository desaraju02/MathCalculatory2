package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Math2Test {

	@Test
	public void testSum() {
		int a = 5;
		int b = 7; 
		int sum = a + b; 
		assertEquals("Sum of 5 and 7 is ", 12, sum);
	}

}
