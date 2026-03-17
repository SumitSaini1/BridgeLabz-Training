import java.util.*;

class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

class Electronics extends Product {
    String warranty;

    public Electronics(String name, int price, int quantity, String warranty) {
        super(name, price, quantity);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price +
                ", Quantity: " + quantity +
                ", Warranty: " + warranty + " months";
    }

}

class Clothing extends Product {
    String size;

    public Clothing(String name, int price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price +
                ", Quantity: " + quantity +
                ", Size: " + size;
    }

}

class Service {
    ArrayList<Product> products = new ArrayList<>();

    public String add(Product p) {
        products.add(p);
        return "Product added to inventory: " + p.getName();
    }

    public void display() {
        products.forEach(System.out::println);

    }

    public String totalValueofInventory() {
        int totalValue = 0;
        for (Product p : products) {
            totalValue = totalValue + p.getPrice() * p.getQuantity();

        }
        return "Total value of the inventory: " + totalValue;
    }

}

public class SupermarketStore {
    Service service = new Service();

    public void displayAndTotal() {

        System.out.println("Inventory:");
        service.display();
        String total = service.totalValueofInventory();
        System.out.println(total);
    }

    public void processInput(String input) {

        String[] splitInput = input.split(",\\s*");
        if (splitInput[0].equals("Electronics")) {
            Product electronics = new Electronics(splitInput[1], Integer.parseInt(splitInput[2]),
                    Integer.parseInt(splitInput[3]), splitInput[4]);
            String res = service.add(electronics);
            System.out.println(res);
        }
        if (splitInput[0].equals("Clothing")) {
            Product clothing = new Clothing(splitInput[1], Integer.parseInt(splitInput[2]),
                    Integer.parseInt(splitInput[3]), splitInput[4]);
            String res = service.add(clothing);
            System.out.println(res);
        }

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            SupermarketStore store = new SupermarketStore();
            for (int i = 0; i < n; i++) {
                String input = sc.nextLine();
                store.processInput(input);
            }

            store.displayAndTotal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
