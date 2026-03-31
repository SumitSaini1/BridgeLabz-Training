package com.example.json.json_handling;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

class Students{
	public String name;
	public int age;
	public Students(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class ListObjectToJson {

	public static void main(String[] args) {
		ArrayList<Students> user=new ArrayList<>();
		user.add(new Students("Sumit",22));
		user.add(new Students("Rahul",21));
		
		
		
		JSONArray array=new JSONArray();
		for(Students s: user) {
			JSONObject mapper=new JSONObject();
			mapper.put("Name", s.getName());
			mapper.put("Age", s.getAge());
			array.put(mapper);
			
		}
		System.out.println(array.toString());
		

		

	}

}
