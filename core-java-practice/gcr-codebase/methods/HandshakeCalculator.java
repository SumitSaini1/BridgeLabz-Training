import java.util.Scanner;

public class HandshakeCalculator {

    // method to calculate the handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take user input 
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Call method to find number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result;
        System.out.println("The maximum number of handshakes is: " + handshakes);
    }
}
