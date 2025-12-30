class CartItem {

    // instance variables to store item details
    String itemName;
    double price;
    int quantity;

    // method to add item 
    void addItem(int qty) {

        // add quantity
        quantity = quantity + qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    // method to remove item quantity 
    void removeItem(int qty) {

        // check if enough quantity 
        if (quantity >= qty) {
            quantity = quantity - qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove item. insufficient quantity.");
        }
    }

    // method to calculate 
    void displayTotalCost() {

        double totalCost = price * quantity;
        System.out.println("Total cost: $" + totalCost);
    }

    void displayItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {

        // create object
        CartItem cart = new CartItem();

        // assign  item details
        cart.itemName = "Laptop";
        cart.price = 999.99;
        cart.quantity = 1;

        // display initial item
        cart.displayItem();

        // add items to cart
        cart.addItem(2);

        // remove item from cart
        cart.removeItem(1);

        // display total cost
        cart.displayTotalCost();
    }
}
