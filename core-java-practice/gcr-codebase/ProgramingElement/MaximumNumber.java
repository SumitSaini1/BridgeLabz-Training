import java.util.Scanner;

public class MaximumNumber {
    public static void maxCalculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int numberOfStudent = input.nextInt();

        int maxNumber = (numberOfStudent * (numberOfStudent - 1)) / 2;
        System.out.println("Number of possible handshakes :" + maxNumber);
    }
    public static void main(String[] args) {
        MaximumNumber.maxCalculate();
    }
    
}
