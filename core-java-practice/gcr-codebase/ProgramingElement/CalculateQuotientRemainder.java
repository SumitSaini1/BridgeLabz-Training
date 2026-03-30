import java.util.Scanner;

public class CalculateQuotientRemainder {
    public static void Calculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one  : ");
        int number1=input.nextInt();

        System.out.println("Enter number one  : ");
        int number2=input.nextInt();

        int quotient=number1 / number2; // find Quotient

        int remainder=number1 % number2;

        System.out.println("The Quotient is "+ quotient + " and Reminder is " + remainder + " of two number " + number1 + " " + number2);

        input.close();



        

    }
    public static void main(String[] args) {
        CalculateQuotientRemainder.Calculate();
        
        
    }
    
}
