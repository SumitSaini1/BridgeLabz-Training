import java.util.*;

public class LineComparisonComputation {
    // case:1 Calculate Length
    public static double calculateLength(double x1, double y1, double x2, double y2) {

        // difference of x1, x2
        double dx = x2 - x1;

        // difference of y1, y2
        double dy = y2 - y1;

        double length = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return length;

    }

    // case2: Check Line Equality
    public static void lineEquality(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4) {
        
        // calculate lengths
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);

        if (Double.valueOf(length1).equals(Double.valueOf(length2))) {
            System.out.println("Both lines are equal");

        } else {
            System.out.println("Both lines are not equal");
        }
    }

    // case:3 compare two lines
    public static int comapreLines(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4) {

        // call length method to calculate
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);
        // compare two lengths
        int result = Double.compare(length1, length2);
        return result;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input for Line 1
        System.out.println("Enter coordinates for Line 1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Input for Line 2
        System.out.println("Enter coordinates for Line 2:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // call method to check lines are equal or not 
        lineEquality(x1, y1, x2, y2, x3, y3, x4, y4);

        // call method to compare lines
        int result = comapreLines(x1, y1, x2, y2, x3, y3, x4, y4);
        if (result == 0) {
            System.out.println("Lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than line 2");
        } else {
            System.out.println("Line 1 is smaller than line 2");
        }
    }

}
