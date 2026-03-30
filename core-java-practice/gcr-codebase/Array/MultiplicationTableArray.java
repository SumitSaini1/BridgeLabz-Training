import java.util.*;

public class MultiplicationTableArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) { // calculate multiplication and store result in to array
            table[i - 1] = number * i;
        }

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) { // Display the table
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();

    }

}
