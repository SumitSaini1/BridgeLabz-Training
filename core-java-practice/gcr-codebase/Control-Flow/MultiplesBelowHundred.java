
import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

       
        if (number <= 0 || number >= 100) { // check for valid number 
            System.out.println("Please enter a positive integer less than 100.");
        } else {

           

            
            for (int i = 100; i >= 1; i--) { // loop backward from 100 to 1

                if (i % number == 0) {
                    System.out.println("Multiples of " + number + " below 100 are: " + i);
                }
            }
        }

        input.close();
    }
}
