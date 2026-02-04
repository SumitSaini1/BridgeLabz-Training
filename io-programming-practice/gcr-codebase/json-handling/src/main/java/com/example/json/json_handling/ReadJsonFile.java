package com.example.json.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonFile {

    public static void main(String[] args) {
        try {
            
        	
            File file = new File("user.json");

            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(file);

            printJson(rootNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void printJson(JsonNode node) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println("Key: " + entry.getKey());
                printJson(entry.getValue());
            }
        } else if (node.isArray()) {
            for (JsonNode element : node) {
                printJson(element);
            }
        } else {
            System.out.println("Value: " + node.asText());
        }
    }
}
