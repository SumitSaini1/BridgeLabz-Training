public class CreditCardOrder extends Order {
    static final int DISCOUNT_PERCENTAGE = 5;

    CreditCardOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    double getDiscountedPrice() {

        double price = super.getAmount();
        double discount = (price * DISCOUNT_PERCENTAGE) / 100;
        double totalPrice = price - discount;

        return totalPrice;
    }

    public void creditCardAmount() {
        super.displayOrderDetails();
        System.out.println("---------------Payments Details-------------");
        System.out.println("Discount Percentage:" + DISCOUNT_PERCENTAGE);
        System.out.println("CreditCardAmount:" + getDiscountedPrice());
    }

}