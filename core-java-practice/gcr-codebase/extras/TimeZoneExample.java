import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {

    public static void main(String[] args) {

        // Formatter for readable output
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // GMT Time
        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " +
                gmtTime.format(formatter));

        // IST Time
        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " +
                istTime.format(formatter));

        // PST Time
        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " +
                pstTime.format(formatter));
    }
}
