import java.util.Scanner;

public class MonthlyCalendar {

    // method to get month name using array
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        return months[month - 1]; // month starts from 1
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {
        // Leap year condition
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        // check February for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to find first day of the month 
    
    public static int getFirstDay(int month, int year) {

        int d = 1; // first day of month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take user input
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // print month and year
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        // first loop: print spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // second loop: print all days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
