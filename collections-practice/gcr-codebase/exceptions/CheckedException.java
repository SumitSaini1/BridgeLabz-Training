import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        try {
            // creating file input stream to read file
            FileInputStream fis = new FileInputStream("Example.txt");

            // reading one byte from file
            int data = fis.read();

            // printing byte value
            System.out.println(data);

            // closing the file stream
            fis.close();

        } catch (IOException e) {
            // handling file not found or read error
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
}
