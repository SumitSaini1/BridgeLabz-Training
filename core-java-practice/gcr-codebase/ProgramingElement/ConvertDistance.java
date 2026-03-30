import java.util.Scanner;

public class ConvertDistance {
    public static void calculateMiles() {
        Scanner sc = new Scanner(System.in); // make Scanner object to take a input
        System.out.println("Enter Kilometer");
        double km = sc.nextInt();
        double totalMile = km / 1.6; // convert to mile formula
        System.out.println("The total miles is " + totalMile + " mile for the given " + km + " km");
    }
    public static void main(String[] args) {
        ConvertDistance.calculateMiles();
        
    }
}
