import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        // creating scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // taking first number from user
            System.out.println("enter a first number:");
            int a = input.nextInt();

            // taking second number from user
            System.out.println("enter a second number:");
            int b = input.nextInt();

            // performing division
            int c = a / b;

            // printing result
            System.out.println("divide: " + c);

        } 
        // handling divide by zero exception
        catch (ArithmeticException e) {
            System.out.println("we cannot divide by zero");
        } 
        // finally block always executes
        finally {
            System.out.println("operation completed");
        }
    }
}
