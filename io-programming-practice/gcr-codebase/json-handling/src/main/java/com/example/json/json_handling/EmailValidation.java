package com.example.json.json_handling;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;


import java.io.InputStream;

public class EmailValidation {

    public static void main(String[] args) {
        try (InputStream schemaStream =
                     EmailValidation.class.getResourceAsStream("user.json")) {

            JSONObject schemaJson = new JSONObject(new JSONTokener(schemaStream));
            Schema schema = SchemaLoader.load(schemaJson);

            JSONObject validJson = new JSONObject();
            validJson.put("email", "test@example.com");

            schema.validate(validJson);
            System.out.println("Email is valid");

        } catch (Exception e) {
            System.out.println("Invalid email: " + e.getMessage());
        }
    }
}
