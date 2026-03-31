package RestaurantTableReservationSystem;

import java.util.Scanner;

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Service services = new Service();

        // pre-added tables
        services.addTable(new Table(1, 5));
        services.addTable(new Table(2, 6));
        services.addTable(new Table(3, 4));

        int choice;

        do {
            System.out.println("\n===== Restaurant Table Reservation Menu =====");
            System.out.println("1. Show available tables");
            System.out.println("2. Reserve a table");
            System.out.println("3. Cancel reservation");
            System.out.println("4. Find reservation by id");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    services.displayAllAvailableTable();
                    break;

                case 2:
                    System.out.print("Enter reservation id: ");
                    int id = sc.nextInt();

                    System.out.print("Enter customer name: ");
                    String name = sc.next();

                    System.out.print("Enter table number: ");
                    int tableNo = sc.nextInt();

                    try {
                        boolean reserved = services.reserveTable(id, name, tableNo);
                        if (reserved) {
                            System.out.println("Reservation successful");
                        }
                    } catch (TableAlreadyReservedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter reservation id to cancel: ");
                    int cancelId = sc.nextInt();

                    if (services.cancelreservations(cancelId)) {
                        System.out.println("Reservation cancelled successfully");
                    } else {
                        System.out.println("No reservation found with this id");
                    }
                    break;

                case 4:
                    System.out.print("Enter reservation id to search: ");
                    int searchId = sc.nextInt();
                    services.findReservationsById(searchId);
                    break;

                case 5:
                    System.out.println("Thank you for using the system");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
