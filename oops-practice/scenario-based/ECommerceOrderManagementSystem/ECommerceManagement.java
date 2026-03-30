package oops.ECommerceOrderManagementSystem;

import java.util.Scanner;

public class ECommerceManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined objects 
        Product p1 = new Product(101, "Laptop", "Electronics", 55000);
        Customer c1 = new Customer(1, "Sumit", "Raya");

        Order order = null;

        int choice;

        do {
            System.out.println("\n========= E-MANAGEMENT SYSTEM =========");
            System.out.println("1. Place Order");
            System.out.println("2. Cancel Order");
            System.out.println("3. View Order Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Payment Method (CARD / UPI / WALLET): ");
                    String payMethod = sc.next();

                    order = new Order(1, qty, payMethod, p1, c1);
                    order.placedOrder();
                    break;

                case 2:
                    if (order != null) {
                        order.cancelOrder();
                    } else {
                        System.out.println("No order to cancel");
                    }
                    break;

                case 3:
                    if (order != null) {
                        order.displayOrderDetails();
                    } else {
                        System.out.println("No order found");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using E-Management System");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();

    }
}