// abstract parent class
abstract class FoodItem {

    // encapsulated fields
    private String itemName;
    private double price;
    private int quantity;

    // constructor
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // abstract method
    abstract double calculateTotalPrice();

    // concrete method
    void getItemDetails() {
        System.out.println("---------------Food Item Details----------------");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// interface
interface Discountable {
    void applyDiscount();
    void getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {

    static final double DISCOUNT_PERCENT = 10;
    double totalPrice;

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity();
        return totalPrice;
    }

    public void applyDiscount() {
        totalPrice = calculateTotalPrice();
        totalPrice -= (totalPrice * DISCOUNT_PERCENT) / 100;
    }

    public void getDiscountDetails() {
        System.out.println("Veg Item Discount: " + DISCOUNT_PERCENT + "%");
    }

    void getItemDetails() {
        applyDiscount();
        super.getItemDetails();
        System.out.println("Total Price (After Discount): " + totalPrice);
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {

    static final double EXTRA_CHARGE = 50;
    double totalPrice;

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        totalPrice = (getPrice() * getQuantity()) + EXTRA_CHARGE;
        return totalPrice;
    }

    public void applyDiscount() {
        totalPrice = calculateTotalPrice();
    }

    public void getDiscountDetails() {
        System.out.println("Extra Non-Veg Charge: " + EXTRA_CHARGE);
    }

    void getItemDetails() {
        applyDiscount();
        super.getItemDetails();
        System.out.println("Total Price (Including Extra Charge): " + totalPrice);
    }
}

// main class
public class OnlineFoodDeliverySystem {

    // order processing method (polymorphism)
    static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println();
    }

    public static void main(String[] args) {

        // polymorphism
        FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        processOrder(item1);
        processOrder(item2);

        // interface reference
        Discountable discount = (Discountable) item1;
        discount.getDiscountDetails();
    }
}
