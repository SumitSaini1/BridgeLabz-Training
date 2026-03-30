import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[]{sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Call the  method
        double[] result = calculateTrigonometricFunctions(angle);

        // Display output
        System.out.println("Sine value: " + result[0]);
        System.out.println("Cosine value: " + result[1]);
        System.out.println("Tangent value: " + result[2]);
    }
}
