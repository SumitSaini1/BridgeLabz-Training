public class OrderManagement {

	public static void main(String[] args) {
		CreditCardOrder cc=new CreditCardOrder(1,100);
		cc.getDiscountedPrice();
		cc.creditCardAmount();
		
		CashOrder cw=new CashOrder(1,100);
		cw.getDiscountedPrice();
		cw.cashAmount();
		
		

	}

	
}

