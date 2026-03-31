package SmartWarehouseManagementSystem;

public class Groceries extends WareHouseItem{
	private String expiryDate;
	Groceries(String itemId,String itemName,String expiryDate){
		super(itemId,itemName);
		this.expiryDate=expiryDate;
		
		
		
	}
	void displayDetails() {
		System.out.println("Item ID:"+ super.getItemId());
		System.out.println("Item Name:"+super.getItemName());
		System.out.println("Expiry Date:"+expiryDate);
		
	}
	
	
}