package com.example.json.json_handling;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentObject {

	public static void main(String[] args) {
		JSONObject student=new JSONObject();
		student.put("Name", "Sumit Saini");
		student.put("Age", 98);
		
		JSONArray subject=new JSONArray();
		subject.put("Math");
		subject.put("Physics");
		subject.put("English");
		
		student.put("Subject",subject);
		
		System.out.println(student.toString());
		
		
		


	}

}
