import java.util.Scanner;

public class ExceptionPropagationMethods {

    // method that may throw arithmetic exception
    public static void method1() throws ArithmeticException {

        // creating scanner object for user input
        Scanner input = new Scanner(System.in);

        // taking first number from user
        System.out.println("enter a first number:");
        int a = input.nextInt();

        // taking second number from user
        System.out.println("enter a second number:");
        int b = input.nextInt();

        // performing division operation
        int c = a / b;

        // printing result
        System.out.println("divide: " + c);
    }

    // method calling method1 to show exception propagation
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            // calling method2 inside try block
            method2();
        } 
        // handling divide by zero exception
        catch (ArithmeticException a) {
            System.out.println("divide by zero");
        }
    }
}
