import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadUserInputandWritetoFile {

    public static void main(String[] args) {

        System.out.println("Enter text (type 'exit' to stop):");

        try (
            BufferedReader input =
                new BufferedReader(new InputStreamReader(System.in));

            FileWriter output =
                new FileWriter("C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\stringbuilder-stringbuffer\\output.txt")
        ) {

            String line;
            while (!(line = input.readLine()).equalsIgnoreCase("exit")) {
                output.write(line);
                output.write(System.lineSeparator());
            }

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
