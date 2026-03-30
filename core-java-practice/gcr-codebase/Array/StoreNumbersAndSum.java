import java.util.Scanner;

public class StoreNumbersAndSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = new double[10]; // declare array
        double total = 0.0;
        int index = 0;

        while (true) { // loop to infinity

            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            if (num <= 0) { // condition to stop loop
                break;
            }

            if (index == 10) { // if array limit exceed
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) { // display and sum
            System.out.println(arr[i]);
            total = total + arr[i];
        }

        System.out.println("\nTotal Sum = " + total); // print total

        input.close();

    }
}
