import java.util.Scanner;

public class CheckNumberType {

    // Method to Check Number 
    public static int checkNumber(int number) {
        if (number > 0) { // check for positive number 
            return 1;  
        } else if (number < 0) {  // check for Negatoive number 
            return -1;  
        } else {
            return 0;   // zero
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        // Call the  method
        int result = checkNumber(number);

        // Display output
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
