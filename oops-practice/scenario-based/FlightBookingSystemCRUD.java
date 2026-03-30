
import java.util.Scanner;
import java.util.ArrayList;
// flight class represents flight details and seat information
class Flight {
    private int id;
    private String flightName;
    private String from;
    private String to;
    private String date;
    private int maximumSeat;
    private int bookedSeat = 0;
    private int leftSeat;

    // constructor to initialize flight details
    public Flight(int id, String flightName, String from, String to, String date, int maximumSeat) {
        this.id = id;
        this.flightName = flightName;
        this.from = from;
        this.to = to;
        this.date = date;
        this.maximumSeat = maximumSeat;
        this.leftSeat = maximumSeat;
    }

    public int getFlightId() {
        return id;

    }

    public String getFlightName() {
        return flightName;
    }

    public String getFlightDate() {
        return date;
    }

    public int getMaximumSeat() {
        return maximumSeat;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
     // displays flight details
    public void displayFlight() {

        System.out.println("=========== Flight Details ===========");
        System.out.println("Flight ID        : " + id);
        System.out.println("Flight Name      : " + flightName);
        System.out.println("From             : " + from);
        System.out.println("To               : " + to);
        System.out.println("Date             : " + date);
        System.out.println("Maximum Seats    : " + maximumSeat);
        System.out.println("Booked Seats     : " + bookedSeat);
        System.out.println("Available Seats  : " + leftSeat);
        System.out.println("=====================================");
    }
    // books one seat if available
    public int bookedFlight() {
        if (maximumSeat == bookedSeat) {
            return -1;
        } else {
            bookedSeat++;
            leftSeat--;
        }
        return bookedSeat;
    }

}
// customer class stores customer information
class Customer {
    private int id;
    private String customerName;
    private int age;
    // constructor to initialize customer details
    Customer(int id, String customerName, int age) {
        this.id = id;
        this.customerName = customerName;
        this.age = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return id;

    }

    public void displayCustomer() {
        System.out.println("=========== Customer Details ===========");
        System.out.println("Customer ID     : " + id);
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Customer Age    : " + age);
        System.out.println("=======================================");
    }

}
// booking class links customer with flight
class Booking {

    private int bookingId;

    private Flight flight;
    private Customer customer;
    private int seatNumber;
    // constructor to initialize booking
    Booking(int bookingId, Customer customer, Flight flight,int seatNumber) {

        this.bookingId = bookingId;

        this.customer = customer;
        this.flight = flight;
        this.seatNumber=seatNumber;

    }

    public int getBookingId() {
        return bookingId;
    }
    // displays booking details
    public void displayBooking() {
        System.out.println("========== Booking Details ==========");
        System.out.println("Booking ID    : " + bookingId);
        System.out.println("Seat Number   : " + seatNumber);
        System.out.println();

        System.out.println("---- Customer Details ----");
        customer.displayCustomer();
        System.out.println();

        System.out.println("---- Flight Details ----");
        flight.displayFlight();
        

        System.out.println("====================================");
    }

}
// flight service class handles all operations
class FlightService {
    private int bookedId = 0;// booking counter
    private ArrayList<Flight> flights = new ArrayList<>();
    // list of flights
    private ArrayList<Customer> customers = new ArrayList<>();
    // list of customers
    private ArrayList<Booking> bookings = new ArrayList<>();
    // list of bookings
    public Scanner input = new Scanner(System.in);

    // adds a new flight
    public void addFlight(Flight flight) {
        flights.add(flight);
        System.out.println("flight added SuccessFully");

    }

    // adds a new customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("customer added Successfully");
    }

    // displays all flights
    public void viewFlight() {
        if (flights.isEmpty()) {
            System.out.println("No flight found ");
        }
        System.out.println("=======================Available Flights=========================");
        for (Flight f : flights) {
            f.displayFlight();

        }

    }
    // finds flight by id
    private Flight findFlightById(int flightId) {
        for (Flight f : flights) {
            if (f.getFlightId() == flightId) {
                return f;
            }
        }
        return null;

    }
    // finds customer by id
    private Customer findCustomerById(int customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {
                return c;
            }
        }
        return null;

    }

    // books a flight for customer
    public void booking() {

        viewFlight();
        System.out.print("Enter flight id to book:");
        int flightId = input.nextInt();
        input.nextLine();

        Flight flight = findFlightById(flightId);
        if (flight == null) {
            System.out.println("No Flight Found to book");
            return;
        }

        System.out.print("Enter Customer Id:");
        int customerId = input.nextInt();
        input.nextLine();

        Customer customer = findCustomerById(customerId);
        if (customer == null) {
            System.out.println("No Customer Found to book");
            return;

        }
        int seatNumber = flight.bookedFlight();
        if (seatNumber == -1) {
            System.out.println("No Seat Available");
            return;
        }

        Booking booking = new Booking(++bookedId, customer, flight, seatNumber);
        bookings.add(booking);

        System.out.println("Booking SuccessFull:");
        booking.displayBooking();

    }

    // displays all bookings
    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No Booking found");
            return;
        }
        for (Booking b : bookings) {
            b.displayBooking();

        }
    }

     // cancels booking by booking id
    public void cancelBooking(int bookingId) {
        if (bookings.isEmpty()) {
            System.out.println("No Booking found to cancel");
            return;
        }
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingId() == bookingId) {
                bookings.remove(i);
                return;
            }
        }
        System.out.println("No booking found on this id ");

    }

   // searches flight by name (case insensitive)
    public void searchFlightByName(String name){
        boolean found=false;
        String searchKey = name.toLowerCase().trim();

        for(Flight f: flights ){
            String flightName=f.getFlightName().toLowerCase().trim();
            if(flightName.contains(searchKey)){
                found=true;
                f.displayFlight();
                
            }
            
        }
        if(!found){
            System.out.println("No flight found by name:");
        }
        

    }

}

public class FlightBookingSystemCRUD {

    public static void main(String[] args) {

        FlightService services = new FlightService();
        Scanner sc = new Scanner(System.in);

        int choice;
        // menu driven program
        do {
            System.out.println("\n========= FLIGHT BOOKING SYSTEM =========");
            System.out.println("1. Add Flight");
            System.out.println("2. Add Customer");
            System.out.println("3. View All Flights");
            System.out.println("4. Search Flight By Name");
            System.out.println("5. Book Flight");
            System.out.println("6. View All Bookings");
            System.out.println("7. Cancel Booking");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Flight ID: ");
                    int fid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Flight Name: ");
                    String fname = sc.nextLine();

                    System.out.print("From: ");
                    String from = sc.nextLine();

                    System.out.print("To: ");
                    String to = sc.nextLine();

                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    System.out.print("Maximum Seats: ");
                    int seats = sc.nextInt();

                    services.addFlight(new Flight(fid, fname, from, to, date, seats));
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    services.addCustomer(new Customer(cid, cname, age));
                    break;

                case 3:
                    services.viewFlight();
                    break;

                case 4:
                    System.out.print("Enter flight name to search: ");
                    String search = sc.nextLine();
                    services.searchFlightByName(search);
                    break;

                case 5:
                    services.booking();
                    break;

                case 6:
                    services.displayBookings();
                    break;

                case 7:
                    System.out.print("Enter Booking ID to cancel: ");
                    int bid = sc.nextInt();
                    services.cancelBooking(bid);
                    break;

                case 0:
                    System.out.println("Thank you for using Flight Booking System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}

