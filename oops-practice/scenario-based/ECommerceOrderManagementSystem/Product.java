package oops.ECommerceOrderManagementSystem;

public class Product {
    protected int productId;
    protected String productName;
    protected String productCategory;
    protected double productPrice;

    public Product(int productId, String productName, String productCategory, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;

    }

    public double getProductPrice() {
        return productPrice;
    }

    public void displayProductDetails() {
        System.out.println("Product Id:" + productId);
        System.out.println("Product Name:" + productName);
        System.out.println("productCategory:" + productCategory);
        System.out.println("productPrice:" + productPrice);

    }

    public void display() {
        displayProductDetails();

    }

}