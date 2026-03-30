import java.util.Scanner;

public class UnitConvertor {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles= km * km2miles;
        return miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km=miles * miles2km;
        return km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet=meters * meters2feet;
        return feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meter=feet * feet2meters;
        return meter;
    }
    public static void main(String[] args){
        // call functions 
        System.out.println("10 km in miles: " + UnitConvertor.convertKmToMiles(10));
        System.out.println("5 miles in km: " + UnitConvertor.convertMilesToKm(5));
        System.out.println("3 meters in feet: " + UnitConvertor.convertMetersToFeet(3));
        System.out.println("10 feet in meters: " + UnitConvertor.convertFeetToMeters(10));
    


    }
}
