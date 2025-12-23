import java.util.Scanner;

public class CalculateBill {
    public static void Calculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Unit price of Product : ");
        float unitPrice=input.nextInt();

        System.out.println("Enter Quantity of Product : ");
        int quantity=input.nextInt();

        float totalPrice=unitPrice * quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+ quantity+" and unit price is INR "+ unitPrice);

        input.close();


        




    }
    public static void main(String[] args) {
        CalculateBill.Calculate();
    }
    
}
