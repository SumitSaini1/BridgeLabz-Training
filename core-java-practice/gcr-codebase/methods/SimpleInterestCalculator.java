import java.util.Scanner;

public class SimpleInterestCalculator {

    // method to find the simple interrest 
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // formula to find Simple Interest
        double simpleInterest=(principal * rate * time) / 100;
        return simpleInterest;

    }
        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take User Input 
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // call method to calculate Simple Interest 
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display output 
        System.out.println(
            "The Simple Interest is " + simpleInterest +
            " for Principal " + principal +
            ", Rate of Interest " + rate +
            " and Time " + time
        );
    }
}
