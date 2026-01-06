import java.util.*;

// custom exception 
class InvalidScoreException extends Exception {
    InvalidScoreException(String message) {
        super(message);
    }
}

public class StudentmarksAnalyzer {
    // to calculate average
    public static double calculateAverage(double[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double average = sum / marks.length;
        return average;

    }

    // to find maximum
    public static void findMax(double[] marks) {
        int highest = 0;
        int lowest = 0;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > marks[highest]) {
                highest = i;
            }

        }
        System.out.println("Highest marks " + marks[highest]);

    }

    // to find minimum
    public static void findMin(double[] marks) {

        int lowest = 0;
        for (int i = 1; i < marks.length; i++) {

            if (marks[i] < marks[lowest]) {
                lowest = i;
            }

        }

        System.out.println("Lowest marks " + marks[lowest]);
    }

    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of students:");
        int number = input.nextInt();

        // array to store marks
        double[] marks = new double[number];

        int i = 0;
        while (i < number) {
            // handling the error
            try {
                System.out.println("Enter a " + (i + 1) + " Student marks:");
                double mark = input.nextDouble();
                if (mark < 0 || mark > 100) {
                    // throe error
                    throw new InvalidScoreException("Marks cannot below Zero OR above 100");
                } else {
                    // tore marks in array
                    marks[i] = mark;
                    i++;
                }

            } catch (InvalidScoreException e) {
                System.out.println("Exception caught:" + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter integer marks.");
                input.next(); // clear invalid input
            }

        }

        // call method to calculate average
        double average = calculateAverage(marks);

        System.out.println("Average marks is :" + average);

        findMax(marks);
        findMin(marks);

        input.close();
    }

}
