import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        BookShelf library = new BookShelf();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();

                    library.addBookByGenreName(genre, book);
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String delGenre = sc.nextLine();

                    System.out.print("Enter Book Name to Delete: ");
                    String delBook = sc.nextLine();

                    library.deleteBookByGenreName(delGenre, delBook);
                    break;

                case 3:
                    library.displaybooks();
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
