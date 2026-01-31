package com.example.junit_demo;

public class DatabaseConnection {
	boolean databaseConnected=false;
	
	public boolean connected() {
		databaseConnected=true;
		return databaseConnected;
	}
	
	public boolean disconnected() {
		databaseConnected=false;
		return databaseConnected;
		
	}
	
	

}
