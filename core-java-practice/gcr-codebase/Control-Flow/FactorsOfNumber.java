import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        if (number <= 0) { // for positive integer 
            System.out.println("Please enter a positive integer.");
        } else {

            

            
            for (int i = 1; i < number; i++) { // lopp to check from 1 to nth number 
                if (number % i == 0) {
                    System.out.println("Factors of " + number + " are: "+ i);
                }
            }
        }

        input.close();
    }
}
