import java.util.Scanner;

public class ArrayIndexExceptionDemo {

   // methods to generate exception(no handling)
    public static void generateException(String[] names) {
        System.out.println("Name is: " + names[names.length]); // wrong index
    }

    // method to handle exceptions
    public static void handleException(String[] names) {
        try {
            System.out.println("Name is: " + names[names.length]); // wrong index
        } catch (ArrayIndexOutOfBoundsException e) {
            // array index exception handled here
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            // generic runtime exception handled here
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking size of array from user
        System.out.print("Enter number of names: ");
        int size = input.nextInt();
        input.nextLine(); // clear buffer

        // defining array of names
        String[] names = new String[size];

        // taking names input from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // calling method that generates exception
        try {
            generateException(names);
        } catch (RuntimeException e) {
            // exception occurs here and program comes to catch
            System.out.println("Exception occurred in generateException()");
        }

        // calling method that handles exception
        handleException(names);

        input.close();
    }
}
