package com.example.json.json_handling;

import org.json.JSONArray;
import org.json.JSONObject;

public class MergeJson {
	public static void merge(JSONObject student,JSONObject details) {
		JSONObject merge=new JSONObject(student.toString());
		for(String key: details.keySet()) {
			merge.put(key, details.get(key));
		}
		System.out.println(merge.toString());
	}

	public static void main(String[] args) {
		
		JSONObject student=new JSONObject();
		student.put("Name", "Sumit Saini");
		student.put("Age", 98);
		
		JSONObject details=new JSONObject();
		details.put("Course", "MCA");
		details.put("Year", "1");
		
		merge(student,details);
		
		

	}

}
