import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        if (number <= 1) { // check for positive number 
            System.out.println("Please enter an integer greater than 1.");
        } else {

            int greatestFactor = 1;          
            int counter = number - 1;        // start from number - 1

            while (counter >= 1) {

                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;   // stop when first greatest find 
                }

                counter--;   // decrese the counter 
            }

            System.out.println("Greatest factor of " + number +
                               " (excluding itself) is: " + greatestFactor);
        }

        input.close();
    }
}
