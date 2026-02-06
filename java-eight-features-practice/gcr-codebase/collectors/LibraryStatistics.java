package collectors;
import java.util.IntSummaryStatistics;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
class Book{
	private String name;
	private int totalPage;
	
	public Book(String name, int totalPage) {
		this.name = name;
		this.totalPage = totalPage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
}
public class LibraryStatistics {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();

		books.add(new Book("Science", 2500));
		books.add(new Book("Technology", 3200));
		books.add(new Book("History", 1800));
		books.add(new Book("Mathematics", 2900));
		books.add(new Book("Fiction", 1500));
		books.add(new Book("Biography", 2200));
		books.add(new Book("Self Help", 1700));
		books.add(new Book("Programming Java", 3500));
		books.add(new Book("Artificial Intelligence", 4200));
		books.add(new Book("Data Structures", 3000));

		Map<String,IntSummaryStatistics> stateByGener=books.stream().collect(Collectors.groupingBy(Book::getName,Collectors.summarizingInt(Book::getTotalPage)));
		System.out.println(stateByGener);
		

	}

}
