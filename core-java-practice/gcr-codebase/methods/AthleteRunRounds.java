import java.util.Scanner;

public class AthleteRunRounds {

    // Method to calcuulte rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistanceInMeter=5 * 1000;
        double numberofRounds=totalDistanceInMeter / perimeter;
        return numberofRounds;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input triangle sides
        System.out.print("Enter first side of the park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter second side of the park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter third side of the park (in meters): ");
        double side3 = input.nextDouble();

        // Call the  method to find number of rounds 
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
    }
}
