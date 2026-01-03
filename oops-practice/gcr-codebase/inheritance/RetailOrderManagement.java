
class Order {
    // instance 
    protected int orderId;
    protected String orderDate;

    // constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;

    }
    // get order
    public void getOrderStatus() {
        System.out.println("Order Id:" + orderId);
        System.out.println("orderDate:" + orderDate);

    }

}

class ShipOrder extends Order {
    protected int trackingNumber;
    // constructor 
    ShipOrder(int trackingNumber, int orderId, String orderDate) {
        // parent constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    // get details 
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number:" + trackingNumber);

    }

}

class DeliverOrder extends ShipOrder {
    String deliveryDate;

    DeliverOrder(String deliverDate, int trackingNumber, int orderId, String orderDate) {
        // call parent constructor
        super(trackingNumber, orderId, orderDate);
        this.deliveryDate = deliverDate;

    }

    public void getOrderStatus() {
        System.out.println("---------------------ORDER STATUS--------------------------");
        super.getOrderStatus();
        System.out.println("Deliver Date:" + deliveryDate);

    }

}
// main class 
public class RetailOrderManagement {

    public static void main(String[] args) {
        // create object 
        DeliverOrder obj = new DeliverOrder("25/06/2025", 123654, 258963, "20/06/2025");
        obj.getOrderStatus();

    }

}
