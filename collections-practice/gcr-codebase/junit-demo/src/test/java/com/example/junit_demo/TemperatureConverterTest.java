package com.example.junit_demo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class TemperatureConverterTest {
	TemperatureConverter temp=new TemperatureConverter();
	
	@Test
	public void testcelsiusToFahrenheit() {
		assertEquals(77,temp.celsiusToFahrenheit(25));
	}
	
	public void testfahrenheitToCelsius() {
		assertEquals(37,temp.celsiusToFahrenheit(98.6));
	}
	

}
