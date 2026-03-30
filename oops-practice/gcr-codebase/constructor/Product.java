public class Product {

    // instance variables
    String productName;
    double price;

    // class variable
    static int totalProducts = 0;

    // constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increase count when product is created
    }

    // instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // class method
    public static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mobile", 30000);
        Product p3 = new Product("Headphones", 2000);

        p1.displayProductDetails();
        Product.displayTotalProducts();
    }
}
