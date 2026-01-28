package RestaurantTableReservationSystem;
import java.util.*;
public class Reservation {
	private int id;
	private String customerName;
	private int tableNumber;
	
	
	public Reservation(int id,String customerName,int tableNumber) {
		this.id=id;
		this.customerName=customerName;
		this.tableNumber=tableNumber;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getTableNumber() {
		return tableNumber;
	}


	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	
	public void reservationsDetails() {
		System.out.println("======Reservations Details========");
		System.out.println("Id:"+id);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Table Number:"+tableNumber);
		
	}

	

	

	
	
	

}
