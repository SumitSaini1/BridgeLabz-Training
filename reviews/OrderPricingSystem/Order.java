abstract class Order{
    private int orderId;
    private double amount;
    public Order(int orderId,double amount){
        this.orderId=orderId;
        this.amount=amount;
    }
    public int getOrderID(){
        return orderId;
    }

    public double getAmount(){
        return amount;
    }
    public void displayOrderDetails(){
        System.out.println("=============New Order Deatils:===============");
        System.out.println("OrderID:"+getOrderID());
        System.out.println("Amount:"+getAmount());

    }
    abstract double getDiscountedPrice();

    
}