class MovieTicket {

    // instance variables to store ticket details
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked = false;

    // method to book a ticket
    void bookTicket(String movie, String seat, double ticketPrice) {

        // check if ticket is already booked
        if (isBooked) {
            System.out.println("House full Ticket already booked");
            return;
        }

        // assign ticket details
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
        isBooked = true;

        System.out.println("Ticket booked for movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
    }

    // method to display ticket details
    void displayTicket() {

        // check if ticket is booked or not
        if (!isBooked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {

        // create movie ticket object
        MovieTicket ticket = new MovieTicket();

        // display ticket before booking
        ticket.displayTicket();

        // book ticket first time
        ticket.bookTicket("Dragon", "A10", 120.0);

        // try to book again
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);

        // display final ticket 
        ticket.displayTicket();

        
        System.out.println();

        // display booked ticket 
        System.out.println("Ticket booked for movie: " + ticket.movieName);
        System.out.println("Seat Number: " + ticket.seatNumber);
        System.out.println("Price: $" + ticket.price);
    }
}
