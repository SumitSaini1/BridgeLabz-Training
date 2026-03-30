import java.util.Scanner;

public class HeightConverter {
    public static void converter() {
        double heightCm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your height in cm : ");
        heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54; // 1 inch = 2.54 cm for calculate inches

        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(
                "Your Height in cm is " + heightCm +
                        " while in feet is " + feet +
                        " and inches is " + inches);
    }
    public static void main(String[] args) {
        HeightConverter.converter();
        
    }
    
}
