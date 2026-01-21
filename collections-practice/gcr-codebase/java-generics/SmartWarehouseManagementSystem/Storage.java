package SmartWarehouseManagementSystem;
import java.util.ArrayList;
public class Storage <T extends WareHouseItem>{
	private ArrayList<T> items=new ArrayList<>();
	// add item
	public void addItem(T item) {
		items.add(item);
	}
	void display() {
		for(int i=0;i<items.size();i++) {
			System.out.println("Item Id:"+items.get(i).getItemId());
			System.out.println("Item Name:"+items.get(i).getItemName());
		}
	}
	ArrayList<T> getAllItems() {
		return items;
		
	}
}