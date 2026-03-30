public class UniversityFee {
    public static void DiscountFee() {
        int fee = 125000;
        int discoutPercent = 10;
        double discountAmount = fee * discoutPercent / 100;
        double discountPrice = fee - discountAmount;
        System.out.println("The discount amount is INR " + fee + " and final discounted fee is INR" + discountPrice);

    }
    public static void main(String[] args) {
        UniversityFee.DiscountFee();

    }
    
}
