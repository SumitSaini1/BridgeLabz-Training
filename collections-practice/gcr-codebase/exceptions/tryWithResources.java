import java.io.*;

public class tryWithResources {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("Example.txt"))) {

            String line = bfr.readLine();
            System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
