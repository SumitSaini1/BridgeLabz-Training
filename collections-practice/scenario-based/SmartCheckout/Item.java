package SmartCheckout;

public class Item {
	private int itemId;
	private String itemName;
	private double price;
	private int stock;
	public Item(int itemId,String itemName,double price,int stock) {
		this.itemId=itemId;
		this.itemName=itemName;
		this.price=price;
		this.stock=stock;
		
		
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
