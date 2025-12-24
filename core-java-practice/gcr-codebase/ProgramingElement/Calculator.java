import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");

        float number1 = sc.nextInt();
        System.out.println("Enter Second number :");
        float number2 = sc.nextInt();

        float add = number1 + number2;
        float sub = number1 - number2;
        float mul = number1 * number2;
        float divide = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " "
                + number2 + "is " + add + ", " + sub + ", " + mul + ", " + divide);

    }
    public static void main(String[] args) {
        Calculator.calculate();
    }
    
}
