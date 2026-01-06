
abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    void display() {
        System.out.println("-------------------------Product Details---------------------------------------");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    abstract void calculateDiscount();
    abstract double getFinalPrice();
}

interface Taxable {
    double calculateTax();
    double getTaxDetails();
}

// ---------------- electronics ----------------
class Electronics extends Product implements Taxable {
    static final int DISCOUNT_PERCENT = 5;
    static final int TAX_PERCENTAGE = 25;

    double tax, discount, totalPrice;

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateTax() {
        tax = (getPrice() * TAX_PERCENTAGE) / 100;
        return tax;
    }

    public double getTaxDetails() {
        return tax;
    }

    void calculateDiscount() {
        discount = (getPrice() * DISCOUNT_PERCENT) / 100;
    }

    double getFinalPrice() {
        calculateTax();
        calculateDiscount();
        totalPrice = getPrice() + tax - discount;
        return totalPrice;
    }

    void display() {
        getFinalPrice();
        super.display();
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + totalPrice);
    }
}

// ---------------- clothing ----------------
class Clothing extends Product implements Taxable {
    static final int DISCOUNT_PERCENT = 11;
    static final int TAX_PERCENTAGE = 25;

    double tax, discount, totalPrice;

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateTax() {
        tax = (getPrice() * TAX_PERCENTAGE) / 100;
        return tax;
    }

    public double getTaxDetails() {
        return tax;
    }

    void calculateDiscount() {
        discount = (getPrice() * DISCOUNT_PERCENT) / 100;
    }

    double getFinalPrice() {
        calculateTax();
        calculateDiscount();
        totalPrice = getPrice() + tax - discount;
        return totalPrice;
    }

    void display() {
        getFinalPrice();
        super.display();
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + totalPrice);
    }
}

// ---------------- groceries ----------------
class Groceries extends Product implements Taxable {
    static final int DISCOUNT_PERCENT = 8;
    static final int TAX_PERCENTAGE = 25;

    double tax, discount, totalPrice;

    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateTax() {
        tax = (getPrice() * TAX_PERCENTAGE) / 100;
        return tax;
    }

    public double getTaxDetails() {
        return tax;
    }

    void calculateDiscount() {
        discount = (getPrice() * DISCOUNT_PERCENT) / 100;
    }

    double getFinalPrice() {
        calculateTax();
        calculateDiscount();
        totalPrice = getPrice() + tax - discount;
        return totalPrice;
    }

    void display() {
        getFinalPrice();
        super.display();
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + totalPrice);
    }
}


public class ECommercePlatform {

    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 2500),
            new Clothing(2, "Jeans", 3600),
            new Groceries(3, "Fruits", 600)
        };

        printFinalPrices(products);
    }


    public static void printFinalPrices(Product[] products) {
        for (Product p : products) {
            p.display();                 
            System.out.println();
        }
    }
}
