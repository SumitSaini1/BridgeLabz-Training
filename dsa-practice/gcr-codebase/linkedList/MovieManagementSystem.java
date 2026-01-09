class Node {
    String movieTitle;
    String director;
    int yearOfRelease;
    int rating;

    Node prev;
    Node next;

    Node(String movieTitle, String director, int yearOfRelease, int rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

public class MovieManagementSystem {

    public static Node head;
    public static Node tail;
    public static int size;

    // add movie at beginning
    public void addBeginning(String movieTitle, String director, int yearOfRelease, int rating) {
        Node newNode = new Node(movieTitle, director, yearOfRelease, rating);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add movie at end
    public void addLast(String movieTitle, String director, int yearOfRelease, int rating) {
        Node newNode = new Node(movieTitle, director, yearOfRelease, rating);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add movie at specific position
    public void addAtPosition(String movieTitle, String director, int yearOfRelease, int rating, int index) {

        if (index == 0) {
            addBeginning(movieTitle, director, yearOfRelease, rating);
            return;
        }

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(movieTitle, director, yearOfRelease, rating);
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
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    // remove movie by title
    public void removeByTitle(String movieTitle) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // delete head
        if (head.movieTitle.equals(movieTitle)) {
            head = head.next;
            size--;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            System.out.println("Movie deleted");
            return;
        }

        Node curr = head.next;

        while (curr != null) {
            if (curr.movieTitle.equals(movieTitle)) {
                curr.prev.next = curr.next;

                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                } else {
                    tail = curr.prev;
                }

                size--;
                System.out.println("Movie deleted");
                return;
            }
            curr = curr.next;
        }

        System.out.println("Movie not found");
    }

    // search movie by director
    public void searchByDirector(String director) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Movie Title: " + temp.movieTitle);
                System.out.println("Director: " + temp.director);
                System.out.println("Year: " + temp.yearOfRelease);
                System.out.println("Rating: " + temp.rating);
                System.out.println("--------------------------------");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director");
        }
    }

    // search movie by rating
    public void searchByRating(int rating) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Movie Title: " + temp.movieTitle);
                System.out.println("Director: " + temp.director);
                System.out.println("Year: " + temp.yearOfRelease);
                System.out.println("Rating: " + temp.rating);
                System.out.println("--------------------------------");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating");
        }
    }

    // display movies forward
    public void displayForward() {
        Node temp = head;

        if (head == null) {
            System.out.println("No movie records");
            return;
        }

        System.out.println("===== Movie Records (Forward) =====");
        while (temp != null) {
            System.out.println("Movie Title: " + temp.movieTitle);
            System.out.println("Director: " + temp.director);
            System.out.println("Year: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println("--------------------------------");
            temp = temp.next;
        }
    }

    // display movies reverse
    public void displayReverse() {
        Node temp = tail;

        if (tail == null) {
            System.out.println("No movie records");
            return;
        }

        System.out.println("===== Movie Records (Reverse) =====");
        while (temp != null) {
            System.out.println("Movie Title: " + temp.movieTitle);
            System.out.println("Director: " + temp.director);
            System.out.println("Year: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println("--------------------------------");
            temp = temp.prev;
        }
    }

    // update rating by movie title
    public void updateRatingByTitle(String movieTitle, int newRating) {
        Node temp = head;

        while (temp != null) {
            if (temp.movieTitle.equals(movieTitle)) {
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    public static void main(String[] args) {

        MovieManagementSystem movie = new MovieManagementSystem();

        movie.addBeginning("Inception", "Nolan", 2010, 9);
        movie.addLast("Interstellar", "Nolan", 2014, 8);
        movie.addLast("Avatar", "Cameron", 2009, 7);

        movie.addAtPosition("Titanic", "Cameron", 1997, 9, 1);

        movie.displayForward();
        movie.displayReverse();

        movie.searchByDirector("Nolan");
        movie.searchByRating(9);

        movie.updateRatingByTitle("Avatar", 8);

        movie.removeByTitle("Inception");

        movie.displayForward();

        System.out.println("Size: " + size);
    }
}
