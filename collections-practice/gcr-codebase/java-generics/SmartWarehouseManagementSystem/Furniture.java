package SmartWarehouseManagementSystem;

public class Furniture extends WareHouseItem{
	private String material;
	Furniture(String itemId,String itemName,String material){
		super(itemId,itemName);
		this.material=material;
		
	}
	void displayDetails() {
		System.out.println("Item ID:"+ super.getItemId());
		System.out.println("Item Name:"+super.getItemName());
		System.out.println("Material:"+material);
		
	}
	
	
}
