package com.example.json.json_handling;

import org.json.JSONObject;

public class ValidateJson {

	public static void main(String[] args) {

		JSONObject student=new JSONObject();
		student.put("Name", "Sumit Saini");
		student.put("Age", 98);
		
		if(student.has("Name") && student.has("Age")) {
			System.out.println("Validate Successfull");
		}else {
			System.out.println("Error:");
		}
		// TODO Auto-generated method stub

	}

}
