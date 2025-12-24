import java.util.Scanner;

public class SquareParameter {
    public static void CalculateSqaure() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Parameter");
        int parameter = input.nextInt();

        int sideSquare = parameter / 4;

        System.out.println(" The length of the side is " + sideSquare + " whose perimeter is " + parameter);

    }
    public static void main(String[] args) {
        SquareParameter.CalculateSqaure();
    }
    
}
