import java.util.*;

public class CoffeeCounter {
    public int purchase() {
        Scanner sc = new Scanner(System.in); // Create Scanner object for taking input

        int Gst = 28; // Fix Gst for all type of Coffee
        
        int totalPrice = 0;
        while (true) {
            int cofeePrice = 0; // CofeePrice initialize with zero
            
            System.out.println("Enter Coffeetype: ");
            String coffeeType = sc.nextLine(); // Ask for coffeeTyoe

            if (coffeeType.equals("exit")) {
                System.out.println("Ordering has Ended ");
                break;

            }

            

            
            switch (coffeeType) { // Set CofeePrice Based on their type
                case "Capachino":
                    cofeePrice = 50;
                    break;
                case "Lathe":
                    cofeePrice = 90;
                    break;
                case "Expresso":
                    cofeePrice = 98;
                    break;
                default:
                    System.out.println("Invalid type");
                    continue;

            }
            System.out.println("Enter Quantity");
            int quantity = sc.nextInt();
            sc.nextLine(); //clear buffer

            totalPrice = Gst + (cofeePrice * quantity); // Total sum of CofeePrice inculding Gst
            System.out.println("----------- COFFEE BILL -----------");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Unit Price  : " + cofeePrice);
            System.out.println("Quantity    : " + quantity);
            System.out.println("-----------------------------------");
            System.out.println("Total Bill  : " + totalPrice);
            System.out.println("-----------------------------------");
            

        }
        return totalPrice;

    }

    public static void main(String[] args) {

        CoffeeCounter obj = new CoffeeCounter(); // Create object
        int price = obj.purchase();
        System.out.println(price);

    }
}
