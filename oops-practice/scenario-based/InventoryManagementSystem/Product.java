package oops.scenario.InventoryManagementSystem;

public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // increase stock
    public void addStock(int addQuantity) {
        this.quantity += addQuantity;
    }

    // reduce stock
    public void reduceStock(int soldQuantity) throws OutOfStockException {
        if (soldQuantity > quantity) {
            throw new OutOfStockException("Not enough stock available!");
        }
        this.quantity -= soldQuantity;
    }
    

    // display
    public void display() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("-----------------------------");
    }
}
