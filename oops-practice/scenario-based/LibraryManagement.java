

import java.util.*;

public class LibraryManagement {
     // to display books 
     public static void display(String[][] book) {
        System.out.println("---------------------Library Books Details--------------------------------");
        for (int i = 0; i < book.length; i++) {
            System.out.println("---------------------Book " + (i) + "--------------------------------");
            System.out.println("Title of book:" + book[i][0]);
            System.out.println("Author of book:" + book[i][1]);
            System.out.println("Status of book:" + book[i][2]);

        }
    }

    // check search book on partial name 
    public static void searchBook(String[][] book, Scanner input) {
        System.out.println("Enter a book title to find:");
        String title = input.nextLine();
        boolean found = false;
        // find book on title 
        for (int i = 0; i < book.length; i++) {
            String bookTitle = book[i][0];
            if (book[i][0] != null && bookTitle.toLowerCase().contains(title.toLowerCase().trim())) {
                System.out.println("-------------------Book Found ---------------------------");

                System.out.println("Title of book:" + book[i][0]);
                System.out.println("Author of book:" + book[i][1]);
                System.out.println("Status of book:" + book[i][2]);
                found = true;
            }

        }
        // if book is not in libraray 
        if (!found) {
            System.out.println("Book not found:");
        }

    }
   
    // to update status 
    public static String[][] updateBookStatus(String[][] book, Scanner input) {
        System.out.println("\nEnter exact book title to checkout/return:");
        String title = input.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < book.length; i++) {
            if (book[i][0].equalsIgnoreCase(title)) {

                if (book[i][2].equalsIgnoreCase("Available")) {
                    book[i][2] = "Checked Out";
                    System.out.println("Book has been checked out successfully.");
                } else {
                    book[i][2] = "Available";
                    System.out.println("Book has been returned and is now available.");
                }

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found:");
        }
        return book;

    }

    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // Enter number of books 
        System.out.println("Enter a number of books:");
        int number = input.nextInt();
        input.nextLine();
        // create book array to 
        String[][] book = new String[number][3];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter a Book Title:");
            book[i][0] = input.nextLine();
            System.out.println("Enter a Book Author:");
            book[i][1] = input.nextLine();
            System.out.println("Enter a Book Status (Available/Checked Out ):");

            book[i][2] = input.nextLine();

        }
        // call search book
        searchBook(book, input);
        // update String 
        String[][] updateBook = updateBookStatus(book, input);
        // display 
        display(updateBook);

        input.close();

        

    }

}
