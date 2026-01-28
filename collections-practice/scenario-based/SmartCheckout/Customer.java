package SmartCheckout;
import java.util.ArrayList;
public class Customer {
	private int custId;
	private String custName;
	private ArrayList<String> items;
	public Customer(int custID,String custName) {
		this.custId=custID;
		this.custName=custName;
		this.items=new ArrayList<>();
		
		
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public ArrayList<String> getItems() {
		return items;
	}
	public void setItems(String item) {
		items.add(item);
	}
	
	public void displayList() {
		int index=1;
		System.out.println("======Items List========");
		for(String i : items) {
			System.out.println("item "+index+":"+i);
			index++;
			
			
		}
	}
	
	

}
