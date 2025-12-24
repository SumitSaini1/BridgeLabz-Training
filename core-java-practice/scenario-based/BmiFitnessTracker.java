import java.util.Scanner;

public class BmiFitnessTracker {
    public static void CalculateBmi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in KG :");

        double weight = input.nextDouble();
        System.out.println("Enter your height in cm :");

        double heightInCm = input.nextDouble(); // take height in centimeters
        double heightInMeter = heightInCm / 100; // convert Cm to Meter

        double BMI = weight / (heightInMeter * heightInMeter); // Calculate formula for BMI

        System.out.println("--------- BMI REPORT ---------");

        if (BMI <= 18.4) {
            System.out.printf("BMI Value : %.2f%n", BMI);
            System.out.println("Status    : Underweight");

        } else if (BMI <= 24.9) {
            System.out.printf("BMI Value : %.2f%n", BMI);
            System.out.println("Status    : Normal");

        } else if (BMI <= 39.9) {
            System.out.printf("BMI Value : %.2f%n", BMI);
            System.out.println("Status    : Overweight");

        } else {
            System.out.printf("BMI Value : %.2f%n", BMI);
            System.out.println("Status    : Obese");
        }

        System.out.println("------------------------------");
        input.close();

        

    }

    public static void main(String[] args) {
        BmiFitnessTracker.CalculateBmi();
    }
}
