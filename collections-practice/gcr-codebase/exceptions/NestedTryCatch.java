import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {

        // creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        // initializing array
        int[] array = {1, 2, 3, 4, 5, 6, 9};

        // taking index from user
        System.out.print("enter index: ");
        int index = sc.nextInt();

        // taking divisor from user
        System.out.print("enter divisor: ");
        int divisor = sc.nextInt();

        try {
            try {
                // accessing array element using index
                System.out.println("access element by index: " + array[index]);

                // dividing array element by divisor
                System.out.println("divide element: " + array[index] / divisor);
            } 
            // handling invalid array index
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid array index");
            }
        } 
        // handling divide by zero exception
        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
    }
}
