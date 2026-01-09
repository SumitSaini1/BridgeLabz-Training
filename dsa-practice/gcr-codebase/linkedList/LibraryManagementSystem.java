public class LibraryManagementSystem {

    // head points to first node
    public static Node head;
    // tail points to last node
    public static Node tail;

    public static int size;

    // node class to store book data
    public static class Node {

        int bookId;
        String title;
        String author;
        String genre;
        boolean isAvailable;

        Node next;
        Node prev;

        // constructor to create new node
        Node(int bookId, String title, String author, String genre, boolean isAvailable) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    // add book at beginning
    public void addFirst(int bookId, String title, String author, String genre, boolean isAvailable) {
        Node newNode = new Node(bookId, title, author, genre, isAvailable);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add book at end
    public void addLast(int bookId, String title, String author, String genre, boolean isAvailable) {
        Node newNode = new Node(bookId, title, author, genre, isAvailable);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add book at specific position
    public void addAtPosition(int bookId, String title, String author, String genre, boolean isAvailable, int index) {
        if (index == 0) {
            addFirst(bookId, title, author, genre, isAvailable);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(bookId, title, author, genre, isAvailable);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    // remove book by book id
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                size--;
                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // search book by title
    public void searchByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displaySingleBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // search book by author
    public void searchByAuthor(String author) {
        Node temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displaySingleBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // update availability status by book id
    public void updateAvailability(int bookId, boolean isAvailable) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // display all books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No books available");
            return;
        }
        Node temp = head;
        int i = 1;
        System.out.println("============= LIBRARY BOOKS (FORWARD) =============");
        while (temp != null) {
            System.out.println("------------Book " + i + "----------------");
            printBook(temp);
            temp = temp.next;
            i++;
        }
    }

    // display all books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books available");
            return;
        }
        Node temp = tail;
        int i = size;
        System.out.println("============= LIBRARY BOOKS (REVERSE) =============");
        while (temp != null) {
            System.out.println("------------Book " + i + "----------------");
            printBook(temp);
            temp = temp.prev;
            i--;
        }
    }

    // count total number of books
    public void countBooks() {
        System.out.println("Total Books: " + size);
    }

    // display single book details
    private void displaySingleBook(Node temp) {
        System.out.println("------------Book Details----------------");
        printBook(temp);
    }

    // print book details
    private void printBook(Node temp) {
        System.out.println("Book ID: " + temp.bookId);
        System.out.println("Title: " + temp.title);
        System.out.println("Author: " + temp.author);
        System.out.println("Genre: " + temp.genre);
        System.out.println("Available: " + (temp.isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addFirst(1, "Java Basics", "James", "Programming", true);
        library.addLast(2, "Data Structures", "Mark", "Computer Science", true);
        library.addLast(3, "Operating Systems", "Andrew", "Computer Science", false);
        library.addAtPosition(4, "DBMS", "Korth", "Database", true, 2);

        library.displayForward();
        library.displayReverse();

        library.searchByTitle("DBMS");
        library.searchByAuthor("Mark");

        library.updateAvailability(3, true);

        library.removeByBookId(2);

        library.displayForward();

        library.countBooks();
    }
}
