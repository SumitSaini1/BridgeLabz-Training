import java.util.Scanner;

public class YardDistance {
    public static void distance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Distance in yards : ");
        float distance = input.nextFloat();

        // 1yard is 3 feet
        final float feetPerYard = 3.0f;

        // 1 mile is 1760.0;
        final float yardsPerMile = 1760.0f;

        float distanceYard = distance / feetPerYard; // Calculate DistanceYard
        float distanceInMile = distanceYard / yardsPerMile;

        System.out.println("The distance in yards is "+ distanceYard+ " while the distance in miles is "+distanceInMile);


    }
    public static void main(String[] args) {
        YardDistance.distance();
        
    }
    
}
