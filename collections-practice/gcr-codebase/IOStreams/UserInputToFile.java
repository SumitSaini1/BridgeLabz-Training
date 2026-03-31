import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        try {
            // read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // write data to file
            try (FileWriter writer = new FileWriter("user_info.txt")) {
                writer.write("Name: " + name + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Favorite Programming Language: " + language + "\n");
            }

            System.out.println("User information saved successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a number.");
        } catch (IOException e) {
            System.out.println("Error while reading input or writing file.");
            e.printStackTrace();
        }
    }
}
