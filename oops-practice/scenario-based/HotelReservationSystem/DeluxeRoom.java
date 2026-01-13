package oops.scenario.HotelReservationSystem;

public class  DeluxeRoom extends Room{
    final static boolean AC=true;
    final static boolean MEALS=true;
    final static boolean WIFI=true;
    public DeluxeRoom(int roomNumber,String roomType,int roomPrice,String roomStatus){
        super(roomNumber, roomType,roomPrice,roomStatus);



    }
    @Override
    public void display() {
        
        super.display();
        System.out.println("Ac:"+AC);
        System.out.println("Meals:"+MEALS);
        System.out.println("Wifi:"+WIFI);

    }
    
} 

