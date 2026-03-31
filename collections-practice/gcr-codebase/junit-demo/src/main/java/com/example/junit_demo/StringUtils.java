package com.example.junit_demo;

public class StringUtils {
	public String reverseString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

	public boolean isPalindrome(String str) {
		if (str == null) {
            return false;
        }
		String reversed=reverseString(str);
		if(reversed.equals(str)) {
			return true;
		}
		return false;
	}
	public String toUpperCase(String str) {
		if (str == null) {
            return null;
        }
		return str.toUpperCase();
		
	}
	
	

	

}
