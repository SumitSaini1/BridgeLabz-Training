import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        if (number <= 1) { // check for positive integer 
            System.out.println("Please enter an integer greater than 1.");
        } else {

            int greatestFactor = 1;   // initialize

            
            for (int i = number - 1; i >= 1; i--) { // iterate loop from n-1 to n

                if (number % i == 0) {
                    greatestFactor = i;
                    break;   // break loop after first gratest find
                }
            }

            System.out.println("Greatest factor of " + number +
                               " (excluding itself) is: " + greatestFactor);
        }

        input.close();
    }
}
