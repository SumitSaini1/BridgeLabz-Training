import java.util.Scanner;

public class UnitConvertor2 {
    // convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet=yards * yards2feet;
        return feet;
    }

    // convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yards=feet * feet2yards;
        return yards;
    }

    // convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches=meters * meters2inches;
        return inches;
    }

    // convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters=inches * inches2meters;
        return meters;
    }

    // convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        double centimeters=inches * inches2cm;
        return centimeters;
    }

    public static void main(String[] args) {
        System.out.println("5 yards in feet: " + UnitConvertor2.convertYardsToFeet(5));
        System.out.println("6 feet in yards: " + UnitConvertor2.convertFeetToYards(6));
        System.out.println("2 meters in inches: " + UnitConvertor2.convertMetersToInches(2));
        System.out.println("10 inches in meters: " + UnitConvertor2.convertInchesToMeters(10));
        System.out.println("12 inches in centimeters: " + UnitConvertor2.convertInchesToCentimeters(12));
    }
    
}
