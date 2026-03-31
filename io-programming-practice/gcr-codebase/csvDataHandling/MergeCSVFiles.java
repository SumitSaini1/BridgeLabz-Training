package CSVDataHandling;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\students1.csv";
        String file2 = "S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\students2.csv";
        String outputFile = "S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\merged_students.csv";

        Map<String, String> studentMap = new HashMap<>();


        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            br1.readLine(); 
            String line;

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String age = data[2];

                studentMap.put(id, name + "," + age);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Write header
            writer.write("ID,Name,Age,Marks,Grade");
            writer.newLine();

            br2.readLine(); // skip header
            String line;

            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String marks = data[1];
                String grade = data[2];

                if (studentMap.containsKey(id)) {
                    writer.write(id + "," + studentMap.get(id) + "," + marks + "," + grade);
                    writer.newLine();
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
