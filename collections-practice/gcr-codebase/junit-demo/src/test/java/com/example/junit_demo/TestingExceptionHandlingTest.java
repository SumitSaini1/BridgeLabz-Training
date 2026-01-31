package com.example.junit_demo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestingExceptionHandlingTest {
	
	@Test
	public void testDivide() {
		TestingExceptionHandling test=new TestingExceptionHandling();
		assertEquals(1,test.divide(2, 2));
		assertThrows(ArithmeticException.class,()->test.divide(2, 0));
	}
	
	
	
	
	
	
	

}
