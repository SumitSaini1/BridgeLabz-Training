package oops.ECommerceOrderManagementSystem;

public class Order {
    private int orderId;
    private int quantity;
    private String paymentMethod;
    private Product product;
    private double totalBill;

    private Customer customer;

    public Order(int orderId, int quantity, String paymentMethod, Product product, Customer customer) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
        this.product = product;
        this.customer = customer;

    }

    public void placedOrder() {
        totalBill = product.getProductPrice() * quantity;
        CardPayment payment = new CardPayment(120000, 200000, paymentMethod, totalBill);
        try {
            payment.donePayment();
            payment.displayPaymentDetails();
            if (payment.getPaymentStatus()) {
                System.out.println("Payement Successful");
                System.out.println("Order Placed Successfully");
                displayOrderDetails();

            }

        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void cancelOrder() {
        System.out.println("Order " + orderId + " has been cancelled.");
    }

    public void displayOrderDetails() {
        System.out.println("=============Order Details==================");
        System.out.println("Order Id:" + orderId);
        System.out.println("Quantity:" + quantity);
        System.out.println("Payment Method:" + paymentMethod);
        System.out.println("-------------ProductDetails------------------");
        product.display();
        System.out.println("-------------Customer Details------------------");
        customer.display();

    }

}
