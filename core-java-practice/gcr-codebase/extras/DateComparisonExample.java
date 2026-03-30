import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparisonExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Date format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Input first date
        System.out.println("Enter first date (dd/MM/yyyy): ");
        LocalDate firstDate =
                LocalDate.parse(input.nextLine(), formatter);

        // Input second date
        System.out.println("Enter second date (dd/MM/yyyy): ");
        LocalDate secondDate =
                LocalDate.parse(input.nextLine(), formatter);

        // Compare dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is BEFORE second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is AFTER second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the SAME.");
        }
    }
}
