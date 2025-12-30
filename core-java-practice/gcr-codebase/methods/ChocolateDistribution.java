import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter total number of children: ");
        int numberOfChildren = input.nextInt();

        // Call the method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display output
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates are " + result[1] + ".");
    }
}
