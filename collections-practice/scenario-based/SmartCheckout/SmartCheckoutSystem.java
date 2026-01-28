package SmartCheckout;
import java.util.*;

public class SmartCheckoutSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();

        while (true) {
            System.out.println("\n===== SMART CHECKOUT MENU =====");
            System.out.println("1. Add Item to Store");
            System.out.println("2. Add Customer to Queue");
            System.out.println("3. Add Item to Customer Cart");
            System.out.println("4. Checkout (Buy Products)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Item ID: ");
                    int itemId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String itemName = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();

                    Item item = new Item(itemId, itemName, price, stock);
                    service.addItem(item);

                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String custName = sc.nextLine();

                    Customer customer = new Customer(custId, custName);
                    service.addCustomer(customer);

                    System.out.println("Customer added to queue!");
                    break;

                case 3:
                    System.out.print("Enter Customer ID to add items: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    Customer foundCustomer = null;

                    // Search customer in queue
                    for (Customer c : service.customers) {
                        if (c.getCustId() == searchId) {
                            foundCustomer = c;
                            break;
                        }
                    }

                    if (foundCustomer == null) {
                        System.out.println("Customer not found in queue!");
                        break;
                    }

                    System.out.print("Enter Item Name to add: ");
                    String cartItem = sc.nextLine();
                    foundCustomer.setItems(cartItem);

                    System.out.println("Item added to customer cart!");
                    break;

                case 4:
                    service.buyProducts();
                    break;

                case 5:
                    System.out.println("Thank you for using Smart Checkout!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
