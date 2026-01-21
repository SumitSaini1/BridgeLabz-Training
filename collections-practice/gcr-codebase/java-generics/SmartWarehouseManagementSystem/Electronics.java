package SmartWarehouseManagementSystem;

public class Electronics extends WareHouseItem{
	private String warrantyYear;
	Electronics(String itemId,String itemName,String warrantyYear){
		super(itemId,itemName);
		this.warrantyYear=warrantyYear;
	}
	void displayDetails() {
		System.out.println("Item ID:"+ super.getItemId());
		System.out.println("Item Name:"+super.getItemName());
		System.out.println("Warranty Year:"+warrantyYear);
		
	}
	
}