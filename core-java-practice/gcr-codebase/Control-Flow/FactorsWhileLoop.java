import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        if (number <= 0) { // for checking positive integer
            System.out.println("Please enter a positive integer.");
        } else {

            

            int counter = 1;   // initialization

            while (counter < number) {

                if (number % counter == 0) {
                    System.out.println("Factors of " + number + " are:"+ counter);
                }

                counter++;   // increase by afyter each loop 
            }
        }

        input.close();
    }
}
