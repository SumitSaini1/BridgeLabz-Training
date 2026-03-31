package LamdaExpression;
import java.util.*;


class Product{
	private String name;
	private double price;
	private int rating;
	public Product(String name,double price,int rating) {
		this.name=name;
		this.price=price;
		this.rating=rating;
		
	}
	public String toString() {
		return name + "| price:"+price+" | Rating:"+rating;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
public class CustomSortingECommerce {

	
	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<>();
		products.add(new Product("Chole Bhature",80,5));
		products.add(new Product("Burger",25.6,3));
		products.add(new Product("Pizza",50.2,4));
		
		
		System.out.println("Sort By Price");
		products.sort((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
		products.forEach(x->System.out.println(x));
		
		System.out.println("Sort By rating:");
		products.sort((p2,p1)->Integer.compare(p2.getRating(),p1.getRating()));
		products.forEach(System.out::println);
		
		
		
		
		
	}

}
