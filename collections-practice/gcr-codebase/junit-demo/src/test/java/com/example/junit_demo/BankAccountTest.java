package com.example.junit_demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
	static BankAccount obj;
	@BeforeAll
	static void createObject() {
		obj=new BankAccount();
		
	}
	
	
	@Test
	public void testDeposit() {
		assertTrue(obj.deposit(23));
		assertFalse(obj.deposit(0));
	}
	
	@Test
	public void testWithdraw() {
		assertTrue(obj.withdraw(23));
		assertFalse(obj.withdraw(0));
		
	}
	@Test
	public void testGetBalance() {
		assertEquals(25,obj.getBalance());
	}
	
	

}
