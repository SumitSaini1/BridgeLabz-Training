package oops.scenario.HotelReservationSystem;

public class Room {
    private int roomNumber;
    private String roomType;
    private double roomPrice;
    private String roomStatus;
    static final String AVAILABLE = "Available";
    static final String BOOKED = "Booked";

    Room(int roomNumber,String roomType,int roomPrice,String roomStatus){
        this.roomNumber=roomNumber;
        this.roomType=roomType;
        this.roomPrice=roomPrice;
        this.roomStatus=roomStatus;


    }
    public String getRoomStatus(){
        return roomStatus;
    }
    
    public int getRoomNumber(){
        return roomNumber;
    }
    public String getRoomType(){
        return roomType;
    }
    public double getRoomPrice(){
        return roomPrice;
    }
    public void setRoomStatus(String roomStatus){
        this.roomStatus = roomStatus;
    }
    
    public void display(){
        System.out.println("----- Room Details -----");
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Room Price  : ₹" + roomPrice);
        System.out.println("Room Status : " + roomStatus);
    }
    
    
}