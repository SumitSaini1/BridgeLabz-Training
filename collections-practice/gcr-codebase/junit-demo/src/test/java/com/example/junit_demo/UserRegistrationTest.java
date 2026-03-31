package com.example.junit_demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
	UserRegistration user=new UserRegistration();
	
	@Test
	public void testUser() {
		assertTrue(user.setUserDetails("Sumit", "ss@", "123456789"));
		
	}
	
	@Test
	public void testUserRegistration() {
		assertThrows(IllegalArgumentException.class,()->user.setUserDetails("Sumit", "ssgmail.com", "156789789"));
		
	}
	

}
