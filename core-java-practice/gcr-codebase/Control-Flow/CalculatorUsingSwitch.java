import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void Calculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number :");
        double first = input.nextDouble();

        System.out.println("Enter Second number :");
        double second = input.nextDouble();

        System.out.println("Enter operator values +, -, *, / : ");
        char operator = input.next().charAt(0); // for taking char value 

        switch (operator) {
            case '+': // add the value
                double add = first + second;
                System.out.println("Sum: " + add);

                break;
            case '-': // Subtract the value
                double sub = first - second;
                System.out.println("Subtract: " + sub);

                break;

            case '*': // Multiply the value
                double Multiply = first * second;
                System.out.println("Multiply: " + Multiply);

                break;
            case '/': // Divide the value
                double divide = first / second;
                System.out.println("divide: " + divide);

                break;

            default:
                System.out.println("Invalid operator");
                break;
        }
        input.close();

    }
    public static void main(String[] args) {
        CalculatorUsingSwitch.Calculator();
    }
}
