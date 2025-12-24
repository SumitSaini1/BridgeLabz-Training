import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to reverse : ");
        int number = input.nextInt();
        int count = 0;

        int temp = number;
        while (temp != 0) { // to count the digit in number
            temp = temp / 10;
            count++;
        }
        int[] digit = new int[count];
        for (int i = 0; i < count; i++) { // take last digit and put in array
            int lastDigit = number % 10;
            number = number / 10;
            digit[i] = lastDigit;
        }
        System.out.println("The Reverse of given is:  ");
        for (int i = 0; i < count; i++) {
            System.out.print(digit[i] + " ");

        }

        
    }

}
