class Node {

    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    Node next;

    Node(int ticketId, String customerName, String movieName,
         String seatNumber, String bookingTime) {

        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class OnlineTicketReservationSystem {

    public static Node head;
    public static Node tail;
    public static int size;

    // add ticket at end (circular)
    public void addTicket(int ticketId, String customerName, String movieName,
                          String seatNumber, String bookingTime) {

        Node newNode = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);
        size++;

        if (head == null) {
            head = tail = newNode;
            tail.next = head;   // circular link
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // remove ticket by ticket ID
    public void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        // if only one node
        if (head == tail && head.ticketId == ticketId) {
            head = tail = null;
            size--;
            System.out.println("Ticket cancelled");
            return;
        }

        // delete head
        if (head.ticketId == ticketId) {
            head = head.next;
            tail.next = head;
            size--;
            System.out.println("Ticket cancelled");
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != head) {
            if (curr.ticketId == ticketId) {
                prev.next = curr.next;

                if (curr == tail) {
                    tail = prev;
                }

                size--;
                System.out.println("Ticket cancelled");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Ticket not found");
    }

    // display all tickets
    public void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node temp = head;
        System.out.println("===== CURRENT TICKETS =====");

        do {
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie Name: " + temp.movieName);
            System.out.println("Seat Number: " + temp.seatNumber);
            System.out.println("Booking Time: " + temp.bookingTime);
            System.out.println("---------------------------");
            temp = temp.next;
        } while (temp != head);
    }

    // search ticket by customer name
    public void searchByCustomer(String customerName) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equals(customerName)) {
                System.out.println("Ticket ID: " + temp.ticketId);
                System.out.println("Movie: " + temp.movieName);
                System.out.println("Seat: " + temp.seatNumber);
                System.out.println("Time: " + temp.bookingTime);
                System.out.println("---------------------------");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for this customer");
        }
    }

    // search ticket by movie name
    public void searchByMovie(String movieName) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equals(movieName)) {
                System.out.println("Ticket ID: " + temp.ticketId);
                System.out.println("Customer: " + temp.customerName);
                System.out.println("Seat: " + temp.seatNumber);
                System.out.println("Time: " + temp.bookingTime);
                System.out.println("---------------------------");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for this movie");
        }
    }

    // total booked tickets
    public void totalTickets() {
        System.out.println("Total Booked Tickets: " + size);
    }

    public static void main(String[] args) {

        OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();

        system.addTicket(101, "Sumit", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Aditya", "Avatar", "B2", "11:30 AM");
        system.addTicket(103, "Rahul", "Inception", "C3", "01:00 PM");

        system.displayTickets();

        system.searchByCustomer("Sumit");
        system.searchByMovie("Inception");

        system.totalTickets();

        system.removeTicket(102);

        system.displayTickets();
        system.totalTickets();
    }
}
