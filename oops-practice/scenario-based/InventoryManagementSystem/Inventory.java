package oops.scenario.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> productList;

    
    public Inventory() {
        productList = new ArrayList<>();
    }

    
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    
    public void displayAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available in inventory.");
            return;
        }

        for (Product product : productList) {
            product.display();
        }
    }

    
    public Product findProductById(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    
    public void addStock(int productId, int quantity) {
        Product product = findProductById(productId);
        if (product != null) {
            product.addStock(quantity);
            System.out.println("Stock updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    
    public void reduceStock(int productId, int quantity)  {
        Product product = findProductById(productId);
        if (product != null) {
            try {
                product.reduceStock(quantity);
                System.out.println("Stock reduced successfully!");
            } catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Product not found!");
        }
    }
}
