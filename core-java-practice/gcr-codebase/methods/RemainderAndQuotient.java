import java.util.Scanner;

public class RemainderAndQuotient {

    // Method to find remainder and Quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Tak user inputs
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Call the  method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying output
        System.out.println("Quotient is: " + result[0]);
        System.out.println("Remainder is: " + result[1]);
    }
}
