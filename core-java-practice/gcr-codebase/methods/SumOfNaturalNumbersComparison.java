import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    // Method to calculate sum using recursion
    public static int sumUsingRecursion(int n) {
        if(n==0){
            return 0;
        }
        return n+sumUsingFormula(n-1);
    }

    // Method to calculate sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check number is negative 
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        // Call Methods for Calculations
        int recursionSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + recursionSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare results
        if (recursionSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }
}
