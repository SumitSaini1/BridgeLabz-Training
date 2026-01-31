package com.example.junit_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class StringUtilsTest {
	static StringUtils utils;
	
	@BeforeAll
	static void createObject() {
		utils=new StringUtils();
	}
	
	@Test
	public void testReverseString() {
		assertEquals("oh", utils.reverseString("ho"));
	}
	@Test
	public void testIspalindrome() {
		assertTrue(utils.isPalindrome("HHH"));
		assertFalse(utils.isPalindrome("ABC"));
	}
	@Test
	public void testUpperCase() {
		assertEquals("SAINI",utils.toUpperCase("saini"));
		
	}
	@Test
	public void testNull() {
		assertNull(utils.reverseString(null));
		assertNull(utils.toUpperCase(null));
		assertFalse(utils.isPalindrome(null));
		
	}

}
