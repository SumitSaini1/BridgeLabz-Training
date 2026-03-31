package com.example.junit_demo;

public class BankAccount {
	int balance=25;
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			return true;
		}
		return false;
		
	}
	public boolean withdraw(double amount) {
		if(amount<1) {
			return false;
		}
		if(amount<=balance) {
			return true;
			
		}
		return false;
	}
	public int getBalance() {
		return balance;
	}
	

}
