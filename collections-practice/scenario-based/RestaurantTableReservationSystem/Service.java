package RestaurantTableReservationSystem;
import java.util.*;

public class Service {
	ArrayList<Reservation> reservations=new ArrayList<>();
	private HashMap<Integer,Table> maps=new HashMap<>();
	
	// add table in map
	public void addTable(Table table) {
		maps.put(table.getTableNumber(),table);
		System.out.println("Table Added Successful");
		
		
	}
	// display all available table
	public void displayAllAvailableTable() {
		boolean found=false;
		for(Table t: maps.values()) {
			if(t.getisAvailable()) {
				t.displayTableDetails();
				found=true;
				
			}
		}
		if(!found) {
			System.out.println("No table found");
			
		}
		
	}
	
	
	// book reservation\
	public boolean reserveTable(int bookId, String customerName, int tableNumber)
	        throws TableAlreadyReservedException {

	    Table table = maps.get(tableNumber);

	    if (table == null) {
	        System.out.println("Invalid table number");
	        return false;
	    }

	    if (!table.getisAvailable()) {
	        throw new TableAlreadyReservedException("Table already reserved!");
	        
	    }

	    table.reserveTable();
	    reservations.add(new Reservation(bookId, customerName, tableNumber));
	    
	    
	    return true;
	}

	/*public boolean bookReservation(int bookId,String customerName) {
		boolean found=false;
		int tableNumber=0;
		for(Table t: maps.values()) {
			if(t.getisAvailable()) {
				tableNumber=t.getTableNumber();
				reservations.add(new Reservation(bookId,customerName,tableNumber));
				t.reserveTable();
				found=true;
				
				
			
				
			}else {
				found=false;
			}
		}
		return found;
		

		
	}*/
	public boolean cancelreservations(int id) {
		for(int i=0;i<reservations.size();i++) {
			if(reservations.get(i).getId()==id) {
				int tableNo =reservations.get(i).getTableNumber();
				Table table=maps.get(tableNo);
				 if (table != null) {
		                table.cancelReserveTable(); // free table
		            }
				
				reservations.remove(i);
				
				
				return true;
				
			}
			
		}
		return false;
	}
	
	public void findReservationsById(int id ) {
		boolean found=false;
		if(reservations.isEmpty()) {
			System.out.println("No reservation Availables");
			return;
		}
		for(Reservation r: reservations) {
			if(r.getId()==id) {
				r.reservationsDetails();
				found=true;
				return;
				
			}
			
		}
		if(!found) {
			System.out.println("No Reservation Found By id:");
			
		}
	}
	

}
