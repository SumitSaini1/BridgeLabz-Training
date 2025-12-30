import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate windChill
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 
                + (0.6215 * temperature) 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();

        // Call the method
        double result = calculateWindChill(temperature, windSpeed);

        // Display output
        System.out.println("The wind chill temperature is: " + result);
    }
}
