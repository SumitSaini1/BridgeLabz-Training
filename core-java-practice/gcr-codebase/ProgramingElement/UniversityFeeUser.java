import java.util.Scanner;

public class UniversityFeeUser {
    public static void DiscountFee() {
        Scanner sc = new Scanner(System.in); // make Scanner object to take a input
        System.out.println("Enter fee: ");
        int fee = sc.nextInt();
        System.out.println("Enter Discount Percent :");
        int discoutPercent = sc.nextInt();
        double discountAmount = fee * discoutPercent / 100; // formula for discount anout
        double discountPrice = fee - discountAmount; // find final price after discount
        System.out.println("The discount amount is INR " + fee + " and final discounted fee is INR" + discountPrice);

    }
    public static void main(String[] args) {
        UniversityFeeUser.DiscountFee();
    }
    
}
