import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {

    public static void main(String[] args) {

        // Get current date
        LocalDate today = LocalDate.now();

        // Define formatters
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display formatted dates
        System.out.println("Format dd/MM/yyyy     : " + today.format(format1));
        System.out.println("Format yyyy-MM-dd     : " + today.format(format2));
        System.out.println("Format EEE, MMM dd, yyyy: " + today.format(format3));
    }
}
