import java.util.Scanner;

public class NumberCheckArrayMethod {

    // Main method
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            arr[i] = input.nextInt();
        }
        input.close();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }

            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");

            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];

        if (first == last) {
            System.out.println("First and Last elements are Equal");
        } else if (first > last) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

    }
}
