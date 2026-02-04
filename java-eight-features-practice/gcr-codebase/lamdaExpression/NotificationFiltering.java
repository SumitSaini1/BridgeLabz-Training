package LamdaExpression;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {

    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
                "booked",
                "cancelled",
                "medicineBooked",
                "paymentFailed",
                "doctorUnavailable"
        );


        Predicate<String> patientAlerts =
                alert -> alert.equalsIgnoreCase("booked")
                      || alert.equalsIgnoreCase("medicineBooked");

        System.out.println("Filtered Patient Alerts:");

        alerts.stream()
              .filter(patientAlerts)
              .forEach(System.out::println);
    }
}
