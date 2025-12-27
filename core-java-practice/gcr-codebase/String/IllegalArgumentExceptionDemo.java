import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // methods to generate exception(no handling)
    public static void generateException(String text) {
        
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // method to handle exceptions
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            
            System.out.println("IllegalArgumentException handled");
        }
        catch (RuntimeException e) {
           // exception handled here

            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        // call method to generate 
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException()");
        }

        
        handleException(text); // call the method that handle excepytion

        input.close();
    }
}
