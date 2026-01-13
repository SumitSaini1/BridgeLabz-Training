package oops.scenario.HotelReservationSystem;

public class Reservation{
    private int reservationId;
    Guest guest;
    Room room;
    private String CheckInDate;
    private String CheckOutDate;
    private double totalAmount;
    private String seasonType;

    public Reservation(int reservationId,Guest guest,Room room,String CheckInDate,String CheckOutDate,String seasonType){

        this.reservationId=reservationId;
        this.guest=guest;
        this.room=room;
        this.CheckInDate=CheckInDate;
        this.CheckOutDate=CheckOutDate;
        this.seasonType=seasonType;

    }
    public void generateBill(){
        double price=room.getRoomPrice();
        Billing bill=new Billing();

        if(seasonType.equals("normal")){
            totalAmount=bill.normalDays(guest.getNoOfDays(),price);
        }else if(seasonType.equals("seasonal")){
            totalAmount=bill.seasonalDays(guest.getNoOfDays(),price);
        }else{
            System.out.println("invalid season type");
        }



    }
    public void displayReservation(){
        System.out.println("\n==============================");
        System.out.println("       RESERVATION DETAILS");
        System.out.println("==============================");
    
        System.out.println("Reservation ID : " + reservationId);
        System.out.println("Check-In Date  : " + CheckInDate);
        System.out.println("Check-Out Date : " + CheckOutDate);
        System.out.println("Season Type    : " + seasonType);
    
        System.out.println();
        guest.displayGuest();
        System.out.println();
        room.display();
    
        System.out.println("\n----- Billing Summary -----");
        System.out.println("Total Amount  : ₹" + totalAmount);
        System.out.println("==============================\n");
    }
    
    public void checkOut(Reservation reservation){
        reservation.room.setRoomStatus(Room.AVAILABLE);
        System.out.println("Checked out successfully");
    }
    
    
    



}