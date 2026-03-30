import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fahrenheit number :");
        double fahrenheit=input.nextDouble();
        double  fahrenheitToCelsius=fahrenheitToCelsius(fahrenheit);

        System.out.println("Enter a celsius number :");
        double celsius=input.nextDouble();
        double  celsiusToFahrenheit= celsiusToFahrenheit(celsius);

        System.out.println("Temperature in Fahrenheit: " +celsiusToFahrenheit);
        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius);
        input.close();


    }

}
