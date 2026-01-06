import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

class Book {
    String title;
    String author;
    String status;

    Book(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class BookSearchandCheckout {

    static ArrayList<Book> books = new ArrayList<>();
    static Book[] bookArray = new Book[10];
    static int index = 0;

    public static void addBook(String title, String author, String status) {
        Book b = new Book(title, author, status);
        books.add(b);
        bookArray[index++] = b;
    }

    public static void searchBook(Scanner input) {
        System.out.println("Enter a book title to find:");
        String title = input.nextLine().toLowerCase().trim();
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title)) {
                System.out.println("Title: " + b.getTitle());
                System.out.println("Author: " + b.getAuthorName());
                System.out.println("Status: " + b.getStatus());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    public static void updateBookStatus(Scanner input) {
        System.out.println("Enter exact book title to checkout:");
        String title = input.nextLine().trim();

        try {
            for (Book b : books) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    if (!b.getStatus().equalsIgnoreCase("Available")) {
                        throw new BookNotAvailableException("Book is already checked out");
                    }
                    b.setStatus("Checked Out");
                    System.out.println("Book checked out successfully");
                    return;
                }
            }
            System.out.println("Book not found");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        addBook("Physics", "HC Verma", "Available");
        addBook("Maths", "RD Sharma", "Checked Out");

        searchBook(input);
        updateBookStatus(input);

        input.close();
    }
}
