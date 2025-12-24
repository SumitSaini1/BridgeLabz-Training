import java.util.Scanner;

public class ArmstrongNumber{
    public static void checkArmstrong() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        int digits = 0;
        int sum = 0;
        int temp = number; // for finding number of digit

        while (temp != 0) {
            temp /= 10;
            digits++;

        }
        temp = number;
        while (temp != 0) {
            int lastDigit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {

                power = power * lastDigit;

            }
            sum += power;
            temp = temp / 10;

        }
        if(sum == number){
            System.out.println("Armstrong Number");

        }else{
            System.out.println("Not an Armstrong Number");
        }

    }

    public static void main(String[] args) {
        ArmstrongNumber.checkArmstrong();
    }

}
