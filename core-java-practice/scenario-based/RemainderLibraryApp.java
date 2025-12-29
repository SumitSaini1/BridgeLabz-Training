import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class RemainderLibraryApp {

    public static void calculateFine(Scanner input ) {
        int i = 1;
        while (i <= 5) {
             // fix the format of date
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Give Dates for " + i + " book");

            System.out.println("Enter a Due date dd/MM/yyyy:");
            String dateDue = input.nextLine();
            // convert input date String in to actual date format
            LocalDate dueDate = LocalDate.parse(dateDue, formatter);

            System.out.println("Enter a Return Date dd/MM/yyyy");
            // convert input date String in to actual date format
            String inputReturnDate = input.nextLine();
            LocalDate returnDate = LocalDate.parse(inputReturnDate, formatter);

            // to calculate the difference between dates 
            long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
            long fine = 0;
            // if book submit late
            if (daysLate > 0) {
                // add fine 5rs per day
                fine = daysLate * 5;
                System.out.println("You return book late by " + daysLate + "Days");
                System.out.println("Total Fine: " + fine);

            } else if (daysLate == 0) { // return on due date
                System.out.println("You return book on time");

            } else { // return before due date
                System.out.println("you returned book early ");
            }

            System.out.println("-------------------------------------------");
            i++;

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // call method to track fine and book returns
        calculateFine(input);

    }

}
