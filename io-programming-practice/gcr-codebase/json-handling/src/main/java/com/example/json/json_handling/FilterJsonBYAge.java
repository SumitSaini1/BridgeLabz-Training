package com.example.json.json_handling;


import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJsonBYAge {

    public static void main(String[] args) {

        String json = """
        [
          { "name": "Sumit", "age": 22 },
          { "name": "Rahul", "age": 28 },
          { "name": "Amit", "age": 30 },
          { "name": "Neha", "age": 24 }
        ]
        """;

        JSONArray array = new JSONArray(json);
        JSONArray filteredArray = new JSONArray();

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);

            if (obj.getInt("age") > 25) {
                filteredArray.put(obj);
            }
        }

        System.out.println(filteredArray.toString(4));
    }
}
