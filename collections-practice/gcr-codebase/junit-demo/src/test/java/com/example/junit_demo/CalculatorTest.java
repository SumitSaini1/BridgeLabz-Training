package com.example.junit_demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	static Calculator calculator;
	
	@BeforeAll
	static void createObject() {
		calculator=new Calculator();
		
		
	}
	@Test
	void testAdd() {
		
		int result = calculator.add(2, 3);
	    assertEquals(5, result);
		
		
		
	}
	@Test
	void testSub() {
		assertEquals(-1,calculator.subtract(2,3));
		
	}
	@Test
	void testMul() {
		assertEquals(6,calculator.multiply(2,3));
		
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class,()->calculator.divide(2,0));
		
	}
	

}
