package RestaurantTableReservationSystem;

public class Table {
	private int tableNumber;
	private int capacity;
	private boolean isAvailable=true;
	Table(int tableNumber,int capacity){
		this.tableNumber=tableNumber;
		this.capacity=capacity;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean getisAvailable() {
		return isAvailable;
	}
	public void reserveTable() {
		isAvailable=false;
	}
	public void cancelReserveTable() {
		isAvailable=true;
	}
	public void displayTableDetails() {
		System.out.println("======Table details======");
		System.out.println("Table Number:"+tableNumber);
		System.out.println("Capacity:"+capacity);
		System.out.println("Availability:"+isAvailable);
		
	}
	
	

}
