package com.example.json.json_handling;
import java.io.IOException;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
class User{
	public int id;
	public String name;
	public String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class ReadJson {

	public static void main(String[] args) {
		try {
			ObjectMapper objectmapper=new ObjectMapper();
			User user=objectmapper.readValue(new File("user.json"), User.class);
			System.out.println(user.getName());
		}catch(IOException e) {
			e.getStackTrace();
		}
		
		
		// TODO Auto-generated method stub
	}

}
