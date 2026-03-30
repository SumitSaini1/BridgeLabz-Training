package oops.scenario.HotelReservationSystem;

public class StandardRoom extends Room {
    final static boolean AC = true;
    final static boolean MEALS = false;
    final static boolean WIFI = false;

    public StandardRoom(int roomNumber, String roomType, int roomPrice, String roomStatus) {
        super(roomNumber, roomType, roomPrice, roomStatus);

    }

    @Override

    public void display() {
        super.display();
        System.out.println("AC           : " + AC);
        System.out.println("Meals        : " + MEALS);
        System.out.println("WiFi         : " + WIFI);
    }

}
