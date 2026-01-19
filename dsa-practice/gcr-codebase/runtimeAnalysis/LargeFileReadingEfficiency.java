
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class LargeFileReadingEfficiency {

    public static void main(String[] args) {

        String filePath = "S:\\Eclipse\\BridgeLabzTraining\\src\\TimeComplexity\\file_100MB.txt"; // 500MB file

        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }

    // Method 1: FileReader
    public static void readUsingFileReader(String filePath) {
        long startTime = System.currentTimeMillis();

        try (FileReader reader = new FileReader(filePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                // reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");
    }

    // Method 2: InputStreamReader
    public static void readUsingInputStreamReader(String filePath) {
        long startTime = System.currentTimeMillis();

        try (InputStreamReader reader =
                     new InputStreamReader(
                             new FileInputStream(filePath), "UTF-8")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                // reading bytes and converting to characters
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");
    }
}
