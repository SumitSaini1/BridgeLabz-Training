import java.util.Scanner;

public class HarshadNumber {
    public static void checkHarshadNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number :");
        int number = input.nextInt();
        int sum = 0;
        int temp = number; // assign original user entered number to 
        while (temp != 0) {

            int lastDigit = temp % 10;
            temp = temp / 10; // remove last digit from an temp
            sum += lastDigit; // add last digit in to sum

        }
        if (number % sum == 0) { // condition to find harshad number
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }

    public static void main(String[] args) {
        HarshadNumber.checkHarshadNumber();
    }

}
