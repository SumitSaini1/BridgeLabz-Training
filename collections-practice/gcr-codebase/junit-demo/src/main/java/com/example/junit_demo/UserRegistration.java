package com.example.junit_demo;

public class UserRegistration {
	private String userName;
	private String email;
	private String password;
	
	public boolean setUserDetails(String name,String email,String password) {
		if(name.contains(" ")) {
			throw new IllegalArgumentException("USername does not contain space");
		}
		userName=name;
		
		if(!email.contains("@")) {
			throw new IllegalArgumentException("email must contain@");
		}
		this.email=email;
		this.email=email;
		if(password.length()<8) {
			throw new IllegalArgumentException("PAssword must contain 8 characters ");
			
		}
		this.password=password;
		return true;
		
	}
	
	

}
