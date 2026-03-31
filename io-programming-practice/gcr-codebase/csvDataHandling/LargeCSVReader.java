package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {
        long totalRecords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv"))) {

            List<String> chunk = new ArrayList<>(CHUNK_SIZE);
            String line;

            while ((line = reader.readLine()) != null) {
                chunk.add(line);

                if (chunk.size() == CHUNK_SIZE) {
                    totalRecords += processChunk(chunk);
                    System.out.println("Records processed: " + totalRecords);
                    chunk.clear();
                }
            }

            if (!chunk.isEmpty()) {
                totalRecords += processChunk(chunk);
                System.out.println("Records processed: " + totalRecords);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int processChunk(List<String> chunk) {
        return chunk.size();
    }
}
