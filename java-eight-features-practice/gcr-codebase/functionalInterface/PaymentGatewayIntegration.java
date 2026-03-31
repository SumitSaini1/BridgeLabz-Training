package FunctionalInterface;
interface PaymentProcessor{
	public void transaction(String method) ;
	default void refund() {
		System.out.println("Refund Successfully");
	}
}
class Bank implements PaymentProcessor{
	public void transaction(String method) {
		System.out.println(method+" Transaction Successful");
		
	}
	@Override
	public void refund() {
		System.out.println("Card Refund Successfully");
	}
	
	
}
public class PaymentGatewayIntegration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank transaction=new Bank();
		transaction.transaction("Card");
		transaction.refund();

	}

}
