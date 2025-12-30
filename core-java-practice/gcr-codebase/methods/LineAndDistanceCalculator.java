import java.util.Scanner;

public class LineAndDistanceCalculator {

    // method to calculate euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {

        // apply distance formula
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // method to calculate slope and y-intercept of a line

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double[] result = new double[2];

        // calculate slope m
        double m = (y2 - y1) / (x2 - x1);

        // calculate yintercept b
        double b = y1 - (m * x1);

        result[0] = m;
        result[1] = b;

        return result;
    }

  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input for first point
        System.out.print("enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("enter y1: ");
        double y1 = input.nextDouble();

        // take input for second point
        System.out.print("enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("enter y2: ");
        double y2 = input.nextDouble();

        // calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // calculate line equation
        double[] line = findLineEquation(x1, y1, x2, y2);

        // display results
        System.out.println("\neuclidean distance between two points: " + distance);
        System.out.println("slope (m): " + line[0]);
        System.out.println("y-intercept (b): " + line[1]);
        System.out.println("equation of line: y = " + line[0] + " * x + " + line[1]);
    }
}
