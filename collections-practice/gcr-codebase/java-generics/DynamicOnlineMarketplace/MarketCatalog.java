import java.util.ArrayList;
public class MarketCatalog {
	private ArrayList<Product <? extends Category>> items=new ArrayList<>();
	public void add(Product <? extends Category> product) {
		items.add(product);
		
	}
	public void display() {
		for(Product <? extends Category> item: items) {
			item.display();
		}
	}
	
	
	
	

}
