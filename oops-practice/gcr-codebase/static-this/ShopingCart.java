class Product {
    // instance variable 
    String productName;
    int price;
    int quantity;
    final int productId;
    int totalBill;
    int discountAmount;
    // static
    static int discount = 5;

    // constructor
    Product(String productName, int price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;

    }

    // calculate bill
    void calculateBill() {
        int bill = price * quantity;
        // apply discount
        discountAmount = (price * discount) / 100;
        totalBill = bill - discount;

    }

    static void updateDiscount() {
        discount = 6;
    }
    // display all records 
    void displayDetails() {
        System.out.println("Product ID:"+productId);
        System.out.println("Product Name:"+productName);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Discount:"+discount+"%");
        System.out.println("Price after Discount:"+totalBill);

    }

}

public class ShopingCart {
    public static void main(String[] args) {
        // create object 
        Product p=new Product("Laptop", 5000, 2, 12563);
        if(p instanceof Product){
            System.out.println("-------------------Shoping Cart-------------------------------");
            p.calculateBill();
            p.displayDetails();
        }else{
            System.out.println("onject not belongs to Employee object ");
        }
        
    }

}
