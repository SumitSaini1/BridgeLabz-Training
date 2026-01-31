package com.example.junit_demo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class DatabaseConnectionTest {
	DatabaseConnection con;
	@BeforeEach
	public void setup() {
		con=new DatabaseConnection();
		con.connected();
		
		
	}
	
	
	@AfterEach
	public void down() {
		
		con.disconnected();
		
		
	}
	@Test
	public void isItConnected() {
		assertTrue(con.connected());
		
		
	}
	@Test
	public void isItdisConnected() {
		assertFalse(con.disconnected());
		
		
	}
	
	

}
