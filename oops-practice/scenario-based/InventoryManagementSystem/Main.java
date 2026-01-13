package oops.scenario.InventoryManagementSystem;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Add Stock");
            System.out.println("4. Reduce Stock");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Product Name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    Product product = new Product(id, name, price, qty);
                    inventory.addProduct(product);
                    break;

                case 2:
                    inventory.displayAllProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int addId = sc.nextInt();

                    System.out.print("Enter Quantity to Add: ");
                    int addQty = sc.nextInt();

                    inventory.addStock(addId, addQty);
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int sellId = sc.nextInt();

                    System.out.print("Enter Quantity to Reduce: ");
                    int sellQty = sc.nextInt();

                    inventory.reduceStock(sellId, sellQty);
                    break;

                case 5:
                    System.out.println("Exiting system. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
