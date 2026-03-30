// superclass
class Book {
	// instance variable 
	String title;
	int publicationYear;
	// constructor 
	Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;

	}
	// display 
	public void displayInfo() {
		System.out.println("Title:" + title);
		System.out.println("Publication Year:" + publicationYear);
	}

}
// child class inherit book class 
class Author extends Book {
	String name;
	String bio;
	// constructor
	Author(String name, String bio, String title, int publication) {
		// call parent consutructor 
		super(title, publication);
		this.name = name;
		this.bio = bio;

	}
	// display 
	void displayAuthor() {
		super.displayInfo();
		System.out.println("Author name :" + name);
		System.out.println("Bio:" + bio);

	}
}

// main class
public class LibraryManagement {

	public static void main(String[] args) {
		// object 
		Author a1 = new Author(
				"A. P. J. Abdul Kalam",
				"Indian aerospace scientist and former President of India",
				"Wings of Fire",
				1999);

		a1.displayAuthor();

	}

}
