import java.util.Scanner;

public class NullPointerDemo {
    public static void generateException() { // a method generate exception
        String text = null;

        System.out.println("The charcter is " + text.charAt(0)); // invalid index call

    }

    public static void handleException() { // Handle Exception 
        String text = null;
        try {

            System.out.println("The charcter is " + text.charAt(0)); // invalid index call

        } catch (NullPointerException e) {
            System.out.println("Exception occured in handle exception :");//Handle error 

        }

    }

    public static void main(String[] args) {
        try {
            generateException(); // Exception generate
        } catch (NullPointerException e) {
            System.out.println("Exception occured in generate exception :");

        }

        // Call handleException method 
        handleException();

    }
}