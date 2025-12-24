import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // take input

        if (number <= 0) { // check for positive integer
            System.out.println("Error: Please enter a natural number.");

            return;
        }

        int size = (number / 2) + 1;
        int[] odd = new int[size];
        int[] even = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) { // store odd even
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) { // print odd numbers
            System.out.print(odd[i] + " ");
        }

        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " "); // print even numbers
        }
        input.close();
    }

}