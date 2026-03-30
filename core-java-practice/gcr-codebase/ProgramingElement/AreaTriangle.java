import java.util.Scanner;

public class AreaTriangle {
    public static void calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base number :");
        float base = input.nextInt();
        System.out.println("Enter height number :");
        float height = input.nextInt();

        float area = (1.0f / 2.0f) * base * height;

        float oneInch = 2.54f;
        float areaInches = area / oneInch;

        System.out.println(" Your area of triangle in cm  " + area + " and on inch " + areaInches);

    }
    public static void main(String[] args) {
        AreaTriangle.calculateArea();
    }
    
}
