

import java.util.Scanner;

public class Factorial {
    public static int  factorial(int numbers){
        if(numbers ==0){
            return 1;
        }
        return numbers * factorial(numbers-1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int numbers=input.nextInt();
        int factorial=factorial(numbers);
        System.out.println("The factorial of given number " + numbers+ " is "+ factorial);
        
    }
    
}
