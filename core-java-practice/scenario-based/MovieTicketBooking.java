import java.util.Scanner;

public class MovieTicketBooking {
    // method to take inputs and return arrays of inputs
    public static String[] movieBooking(Scanner input) {

        System.out.println("=======Welcome to movies World=============");

        System.out.println("Enter a movie type (Hollywood/Bollywood):");
        String movieType = input.next().toLowerCase();

        System.out.println("Enter your seat Type (gold/silver):");
        String seatType = input.next().toLowerCase();

        System.out.println("If you want snacks (yes/no)");
        String snacks = input.next().toLowerCase();

        return new String[] { movieType, seatType, snacks };

    }

    public static void calculateBillAndBooking() {
        Scanner input = new Scanner(System.in);
        while (true) {

            String[] usersmovieInput = movieBooking(input);
            String movieType = usersmovieInput[0];
            String seatType = usersmovieInput[1];
            String snacks = usersmovieInput[2];
            int moviePrice = 0;
            int seatPrice = 0;
            int snackPrice = 0;

            switch (movieType) {

                case "hollywood":
                    moviePrice = 250;
                    if (seatType.equals("gold")) {
                        seatPrice = 60;
                    } else {
                        seatPrice = 40;
                    }
                    if (snacks.equals("yes")) {
                        snackPrice = 60;

                    }
                    break;

                case "bollywood":
                    moviePrice = 230;
                    if (seatType.equals("gold")) {
                        seatPrice = 60;
                    } else {
                        seatPrice = 40;
                    }
                    if (snacks.equals("yes")) {
                        snackPrice = 60;

                    }
                    break;
                default:
                    System.out.println("Invalid movie type entered!");
                    continue;

            }
            int total = moviePrice + seatPrice + snackPrice;
            System.out.println("---------------------------------------");
            System.out.println("------------Bill-----------------------");
            System.out.println("Type:\t\t" + movieType);
            System.out.println("Seat:\t\t" + seatType);
            System.out.println("Snacks:\t\t" + snacks);
            System.out.println("moviePrice \t" + moviePrice);
            System.out.println("SeatPrice \t" + seatPrice);
            System.out.println("SnackPrice \t" + snackPrice);
            System.out.println("---------------------------------------");
            System.out.println(" Total Bill To pay " + total);
            System.out.println("--------------------------------------------");

            System.out.print("\nDo you want to book another ticket? (yes/no): ");
            String choice = input.next().toLowerCase();

            if (!choice.equals("yes")) {
                System.out.println("Thank you for booking! ");
                break;
            }

        }

    }

    public static void main(String[] args) {
        calculateBillAndBooking();

    }

}
