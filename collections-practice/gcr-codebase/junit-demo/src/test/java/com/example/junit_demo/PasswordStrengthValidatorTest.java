package com.example.junit_demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class PasswordStrengthValidatorTest {
	PasswordStrengthValidator obj=new PasswordStrengthValidator();
	
	@Test
	public void testPassword() {
		assertTrue(obj.passwordvalidator("Sumit1@#$$"));
	}
	
	
	
	
	

}
