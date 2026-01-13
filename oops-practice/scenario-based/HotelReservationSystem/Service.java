package oops.scenario.HotelReservationSystem;
import java.util.ArrayList;
public class Service{
    private ArrayList<Room> rooms=new ArrayList<>();
    private ArrayList<Guest> guests=new ArrayList<>();
    public ArrayList<Reservation> reservations=new ArrayList<>();

    public void addRoom(Room room){
        rooms.add(room);
        
    }
    public void addGuest(Guest guest){
        guests.add(guest);
    }
    public void addReservation(Reservation reservation) throws  RoomNotAvailableException{
        if(reservation.room.getRoomStatus().equalsIgnoreCase(Room.BOOKED)){
            throw new RoomNotAvailableException(
                "Room " + reservation.room.getRoomNumber() + " is already booked"
            );
        }
    
        reservation.generateBill();
        reservation.room.setRoomStatus(Room.BOOKED);
        reservations.add(reservation);
    }
    
    public void displayReservationDeatils(){
        System.out.println("\n******** HOTEL RESERVATIONS ********");
    
        if(reservations.isEmpty()){
            System.out.println("No reservations found.");
        } else {
            for(Reservation r : reservations){
                r.displayReservation();
            }
        }
    
        System.out.println("***********************************\n");
    }
    
    




}
