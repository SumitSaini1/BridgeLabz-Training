import java.util.*;

public class BookShelf {

	private HashMap<String, LinkedList<String>> catalog = new HashMap<>();

	public BookShelf() {
		this.catalog = new HashMap<>();

	}

	public void addBookByGenreName(String genre, String bookName) {
		catalog.putIfAbsent(genre, new LinkedList<>());
		catalog.get(genre).add(bookName);
		System.out.println("Added");

	}

	public void deleteBookByGenreName(String genre, String bookName) {
		if (catalog.isEmpty()) {
			System.out.println("No genre available to delete\r\n"
					+ "");
			return;
		}

		if (!catalog.containsKey(genre)) {
			System.out.println("Genre not found");
			return;
		}

		if (catalog.get(genre).remove(bookName)) {
			System.out.println("Deleted Successfully");
		} else {
			System.out.println("Book Not Found");
		}

	}

	public void displaybooks() {
		for (String key : catalog.keySet()) {
			System.out.println("=======Book Details=======");
			System.out.println("Genre:" + key);
			System.out.println("Books:" + catalog.get(key));
		}
	}

}
