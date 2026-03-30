import java.util.Scanner;

public class BasicCalculator {

    // addition
    public static double add(double a, double b) {
        return a + b;
    }

    // subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Result = " + add(num1, num2));

        } else if (choice == 2) {
            System.out.println("Result = " + subtract(num1, num2));

        } else if (choice == 3) {
            System.out.println("Result = " + multiply(num1, num2));

        } else if (choice == 4) {
            System.out.println("Result = " + divide(num1, num2));

        } else {
            System.out.println("Invalid choice!");
        }
    }
}
