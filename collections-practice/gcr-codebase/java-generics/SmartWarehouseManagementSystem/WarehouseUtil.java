package SmartWarehouseManagementSystem;
import java.util.ArrayList;
public class WarehouseUtil{
	public static void displayItems(ArrayList<? extends WareHouseItem> items) {
		for(WareHouseItem item: items) {
			item.displayDetails();
		}
		
	}
}
