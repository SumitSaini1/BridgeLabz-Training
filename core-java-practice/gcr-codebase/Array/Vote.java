import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Students ");
        int numberOfStudents = input.nextInt();
        int[] age = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) { // make a user input array
            System.out.println("Enter " + (i + 1) + " Student age");
            age[i] = input.nextInt();
        }
        for (int i = 0; i < age.length; i++) { // loop for check all element on array
            if (age[i] <= 0) {
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote ");
            } else {
                System.out.println("The student with the age " + age[i] + " can not vote ");
            }
        }

        input.close();
    }
}
