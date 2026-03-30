import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter third number: ");
        double c = input.nextDouble();

        double average = (a + b + c) / 3;
        System.out.println("Average = " + average);

        input.close();
    }
}
