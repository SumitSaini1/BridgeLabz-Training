package Streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FilteringExpiringMemberships {

    String name;
    LocalDate expiryDate;

    FilteringExpiringMemberships(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry Date: " + expiryDate;
    }

    public static void main(String[] args) {

        
        ArrayList<FilteringExpiringMemberships> members = new ArrayList<>();


        members.add(new FilteringExpiringMemberships("Sumit", LocalDate.now().plusDays(10)));
        members.add(new FilteringExpiringMemberships("Rahul", LocalDate.now().plusDays(40)));
        members.add(new FilteringExpiringMemberships("Amit", LocalDate.now().plusDays(25)));
        members.add(new FilteringExpiringMemberships("Neha", LocalDate.now().plusDays(5)));

        
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<FilteringExpiringMemberships> expiringIn30Days =
                members.stream()
                       .filter(m -> 
                                 !m.expiryDate.isAfter(next30Days))
                       .toList();

        System.out.println("Memberships expiring within 30 days:");
        expiringIn30Days.forEach(System.out::println);
    }
}
