import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Formatter for input and output
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Take date input
        System.out.println("Enter a date (dd/MM/yyyy): ");
        String dateInput = input.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(dateInput, formatter);

        System.out.println("Original Date: " + date.format(formatter));

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        System.out.println("After adding 7 days, 1 month, 2 years: "
                + updatedDate.format(formatter));

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("After subtracting 3 weeks: "
                + finalDate.format(formatter));
    }
}
