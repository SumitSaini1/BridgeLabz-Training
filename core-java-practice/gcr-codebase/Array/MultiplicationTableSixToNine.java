import java.util.Scanner;

public class MultiplicationTableSixToNine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // take input

        int[] multiplicationResult = new int[4]; // Declare array

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        System.out.println("\nMultiplication Table of " + number + " (6 to 9):");
        index = 0;
        for (int i = 6; i <= 9; i++) { // display result
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        input.close();
    }

}
