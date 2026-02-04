package com.example.json.json_handling;import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import com.opencsv.*;

import java.io.*;
import java.util.*;

public class IPLAndCensorAnalyzer {

    public static void main(String[] args) throws Exception {
        censorJson("ipl.json", "ipl_censored.json");
        censorCsv("ipl.csv", "ipl_censored.csv");
        System.out.println("Censorship completed successfully");
    }

    static String maskTeam(String team) {
        int lastSpace = team.lastIndexOf(" ");
        return lastSpace == -1 ? "***" : team.substring(0, lastSpace) + " ***";
    }

    static void censorJson(String input, String output) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode inputArray = (ArrayNode) mapper.readTree(new File(input));
        ArrayNode outputArray = mapper.createArrayNode();

        for (JsonNode match : inputArray) {
            ObjectNode obj = mapper.createObjectNode();

            obj.put("match_id", match.get("match_id").asInt());

            String team1 = maskTeam(match.get("team1").asText());
            String team2 = maskTeam(match.get("team2").asText());

            obj.put("team1", team1);
            obj.put("team2", team2);

            ObjectNode scoreNode = mapper.createObjectNode();
            Iterator<String> keys = match.get("score").fieldNames();
            while (keys.hasNext()) {
                String key = keys.next();
                scoreNode.put(maskTeam(key), match.get("score").get(key).asInt());
            }

            obj.set("score", scoreNode);
            obj.put("winner", maskTeam(match.get("winner").asText()));
            obj.put("player_of_match", "REDACTED");

            outputArray.add(obj);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(output), outputArray);
    }

    static void censorCsv(String input, String output) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(input));
        CSVWriter writer = new CSVWriter(new FileWriter(output));

        String[] header = reader.readNext();
        writer.writeNext(header);

        String[] row;
        while ((row = reader.readNext()) != null) {
            row[1] = maskTeam(row[1]);
            row[2] = maskTeam(row[2]);
            row[5] = maskTeam(row[5]);
            row[6] = "REDACTED";
            writer.writeNext(row);
        }

        reader.close();
        writer.close();
    }
}
