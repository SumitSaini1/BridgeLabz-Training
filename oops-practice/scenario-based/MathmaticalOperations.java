import java.util.Scanner;

public class MathmaticalOperations {
    // factorial
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);

    }
    // check prime
    public static boolean isprime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // find GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = b % a;
            a = temp;

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number for calculate factorial:");
        int number=input.nextInt();
        int factorial=factorial(number);
        System.out.println("Factorial:"+factorial);

        // prime number
        System.out.println("Enter a number to check prime or not :");
        int number1=input.nextInt();
        boolean result=isprime(number1);
        if(result){
            System.out.println(:"Given number is prime number");
        }else{
            System.out.println("Given number is not a prime number");
        }

        System.out.println("------------------GCD CALCULATOR--------------------------");
        System.out.println("Enter a first number:");
        int a=input.nextInt();
        System.out.println("Enter a second number:");
        int b=input.nextInt();
        int GCD=gcd(a, b);
        System.out.println("GCD of given number is :"+GCD);

        input.close();
        






    }

}
