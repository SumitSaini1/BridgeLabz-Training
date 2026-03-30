class Book {

    // intance variables
    public String ISBN;          // accessible everywhere
    protected String title;      // accessible in subclass
    private String author;       // accessible only inside Book

    // constructor
    Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    // setter for private variable
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter for private variable
    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    EBook(String ISBN, String title) {
        super(ISBN, title);
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);     
        System.out.println("Title: " + title);   

    }
}


public class LibrarySystem {
    public static void main(String[] args) {

        EBook ebook = new EBook("ISBN-12345", "Java Programming");

        ebook.setAuthor("James Gosling"); 

        ebook.displayDetails();

        System.out.println("Author: " + ebook.getAuthor()); 
    }
    
}
