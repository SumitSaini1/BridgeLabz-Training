import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        
        if (number <= 0 || power < 0) { // check for valid number 
            System.out.println("Please enter positive integers only.");
        } else {

            int result = 1;   // initial value

            
            for (int i = 1; i <= power; i++) {  // loop for calculate power 
                result = result * number;
            }

            System.out.println(number + " raised to the power " +
                               power + " is: " + result);
        }

        input.close();
    }
}
