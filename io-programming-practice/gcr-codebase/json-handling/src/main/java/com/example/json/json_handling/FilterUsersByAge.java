package com.example.json.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterUsersByAge {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("Student.json"));

        for (JsonNode user : root) {
            if (user.get("age").asInt() > 25) {
                System.out.println("Name: " + user.get("name").asText()
                        + ", Age: " + user.get("age").asInt());
            }
        }
    }
}
