import java.util.Scanner;

public class NumberFormatDemo{
     // methods to generate exception(no handling)
     public static void generateException(String text) {
        
        System.out.println("Integer are  " + Integer.parseInt(text));
    }

    // method to handle exceptions
    public static void handleException(String text) {
        try {
            System.out.println("Integer are  " + Integer.parseInt(text));
        }catch (NumberFormatException e) {
           // exception handled here

            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();
    
        // call method to generate 
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");

        }

        handleException(text); // call the method that handle excepytion

        input.close();

    }

        
    
    
}