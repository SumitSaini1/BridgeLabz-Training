import java.util.Scanner;

public class UnitConvertor3 {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheitTwocelsius = (farhenheit - 32) * 5 / 9;
        return farhenheitTwocelsius;
    }

     // convert celsis to farhenheit
     public static double convertCelsiusToFarhenheit(double celsius) {
        double celsiusTwofarhenheit = (celsius * 9 / 5) + 32;
        return celsiusTwofarhenheit;
    }


    // convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsTwokilograms = 0.453592;
        return pounds * poundsTwokilograms;
    }
     // convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTwopounds = 2.20462;
        return kilograms * kilogramsTwopounds;
    }
     // convert gallon to liter
    public static double convertGallonsToLiters(double gallons) {
        double gallonsTwoliters = 3.78541;
        return gallons * gallonsTwoliters;
    }

    // convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersTwogallons = 0.264172;
        return liters * litersTwogallons;
    }
    public static void main(String[] args) {
        System.out.println("98.6 F to Celsius: " + UnitConvertor3.convertFarhenheitToCelsius(98.6));
        System.out.println("37 C to Fahrenheit: " + UnitConvertor3.convertCelsiusToFarhenheit(37));
        System.out.println("10 pounds to kg: " + UnitConvertor3.convertPoundsToKilograms(10));
        System.out.println("5 kg to pounds: " + UnitConvertor3.convertKilogramsToPounds(5));
        System.out.println("2 gallons to liters: " + UnitConvertor3.convertGallonsToLiters(2));
        System.out.println("5 liters to gallons: " + UnitConvertor3.convertLitersToGallons(5));
    }
    
}
