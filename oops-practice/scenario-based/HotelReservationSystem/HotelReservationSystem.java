package oops.scenario.HotelReservationSystem;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Service service = new Service();
        Room room = new StandardRoom(123, "Standard", 2500, Room.AVAILABLE);
        Guest guest = new Guest(1, "ss", 22, "M", 1);

        Reservation reservation = new Reservation(1, guest, room, "25/12/2025", "26/12/2025", "normal");

        service.addGuest(guest);
        service.addRoom(room);
        try {
            service.addReservation(reservation);
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        service.displayReservationDeatils();

    }
}
