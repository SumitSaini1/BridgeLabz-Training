package LamdaExpression;
import java.util.function.Consumer;
class Invoice{
	public int transactionId;
	Invoice(int id){
		this.transactionId=id;
		System.out.println("Transaction Id:"+id);
		
	}
}
public class InvoiceObjectCreation {

	
	public static void main(String[] args) {
		Consumer<Integer> invoice=Invoice::new;
		invoice.accept(1);
		
		
		
	}

}
