import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        if (number < 0) {
            number = -number;
        }

        int temp = number;
        int count = 0;

        
        if (temp == 0) { // find the count 
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }


        int[] digits = new int[count]; //store the number in to array 
        temp = number;

        for (int i = count - 1; i >= 0; i--) { // loop to add value in digit array 
            digits[i] = temp % 10;
            temp /= 10;
        }


        int[] frequency = new int[10]; // frequency 0 to 9

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        
        System.out.println("\nDigit Frequency:");  //Display frequency
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
