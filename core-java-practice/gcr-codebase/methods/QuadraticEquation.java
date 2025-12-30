import java.util.Scanner;
import java.util.Arrays;

public class QuadraticEquation {

    // method to find roots
    public static double[] findRoots(double a, double b, double c) {

       // calculate power
        double delta = Math.pow(b, 2) - 4 * a * c;

        // case 1:two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }

        // case 2: one real root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }

        // case 3: no real roots
        return new double[] {};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two roots are: " + roots[0] + " and " + roots[1]);
        } 
        else if (roots.length == 1) {
            System.out.println("One root is: " + roots[0]);
        } 
        else {
            System.out.println("No real roots exist.");
        }
    }
}
