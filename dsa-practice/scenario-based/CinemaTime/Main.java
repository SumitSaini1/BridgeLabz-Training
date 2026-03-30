package CinemaTime;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CinemaTime cinema = new CinemaTime();

        while (true) {
            System.out.println("\n===== CinemaTime Menu =====");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter movie title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter show time (HH:MM): ");
                        String time = sc.nextLine();

                        cinema.addMovie(title, time);
                        break;

                    case 2:
                        System.out.print("Enter search keyword: ");
                        String keyword = sc.nextLine();
                        cinema.searchMovie(keyword);
                        break;

                    case 3:
                        cinema.displayAllMovies();
                        break;

                    case 4:
                        cinema.generateReport();
                        break;

                    case 5:
                        System.out.println("Exiting CinemaTime. Goodbye!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InvalidTimeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
