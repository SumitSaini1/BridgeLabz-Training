package com.example.json.json_handling;

import com.opencsv.CSVReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.FileReader;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("Data.csv"));
        String[] headers = reader.readNext();

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode jsonArray = mapper.createArrayNode();

        String[] row;
        while ((row = reader.readNext()) != null) {
            ObjectNode obj = mapper.createObjectNode();
            for (int i = 0; i < headers.length; i++) {
                obj.put(headers[i], row[i]);
            }
            jsonArray.add(obj);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(System.out, jsonArray);

        reader.close();
    }
}
