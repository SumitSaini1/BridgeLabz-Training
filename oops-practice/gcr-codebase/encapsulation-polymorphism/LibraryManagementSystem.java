// abstract parent class
abstract class LibraryItem {

    // encapsulated fields
    private int itemId;
    private String title;
    private String author;
    private boolean available = true;

    // constructor
    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // getters
    public int getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return available;
    }

    // protected setter (restricted access)
    protected void setAvailable(boolean status) {
        this.available = status;
    }

    // abstract method
    abstract int getLoanDuration();

    // concrete method
    void getItemDetails() {
        System.out.println("---------------Library Item Details----------------");
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
}

// interface
interface Reservable {
    void reserveItem();
    void checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {

    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book is already reserved");
        }
    }

    public void checkAvailability() {
        System.out.println("Book Available: " + isAvailable());
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {

    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Magazine reserved successfully");
        } else {
            System.out.println("Magazine is already reserved");
        }
    }

    public void checkAvailability() {
        System.out.println("Magazine Available: " + isAvailable());
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {

    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 3;
    }

    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD is already reserved");
        }
    }

    public void checkAvailability() {
        System.out.println("DVD Available: " + isAvailable());
    }
}

// main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // polymorphism
        LibraryItem item1 = new Book(101, "Java Basics", "James Gosling");
        LibraryItem item2 = new Magazine(102, "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD(103, "OOP Concepts", "Tech Media");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");
        System.out.println();

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");
        System.out.println();

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days");
        System.out.println();

        // interface reference
        Reservable reserve = (Reservable) item1;
        reserve.reserveItem();
        reserve.checkAvailability();
    }
}
