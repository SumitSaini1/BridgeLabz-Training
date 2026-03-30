import java.util.Scanner;

public class NumberAnalysis {

    // method to check positive or neagative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // method to check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

   // method to comapre two number
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        //tTaking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // process each number 
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // compare element first and last
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of First and Last Elements:");
        if (result == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

        input.close();
    }
}
