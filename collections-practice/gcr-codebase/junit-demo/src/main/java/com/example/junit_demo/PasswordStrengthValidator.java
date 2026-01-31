package com.example.junit_demo;

public class PasswordStrengthValidator {
	public boolean passwordvalidator(String password) {
		String pattern = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
		if(password.matches(pattern)) {
			return true;
		}
		return false;

	}

}
