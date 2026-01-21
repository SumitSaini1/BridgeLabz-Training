package SmartWarehouseManagementSystem;

public class SmartWareHouseManagementSystem{
	public static void main(String[] args) {
		Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E101", "Laptop", "2"));
        electronicsStorage.addItem(new Electronics("E102", "Mobile", "1"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("G201", "Rice", "2026-01-10"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F301", "Chair", "Wood"));

        System.out.println("=== Electronics ===");
        WarehouseUtil.displayItems(electronicsStorage.getAllItems());

        System.out.println("\n=== Groceries ===");
        WarehouseUtil.displayItems(groceryStorage.getAllItems());

        System.out.println("\n=== Furniture ===");
        WarehouseUtil.displayItems(furnitureStorage.getAllItems());
		
	}
	
	
	
	
	
	
}