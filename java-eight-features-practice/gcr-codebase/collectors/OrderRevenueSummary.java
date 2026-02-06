package collectors;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
class Customer{
	
	private String name;
	private double price;
	public Customer(String name, double price) {
		
		this.name = name;
		this.price = price;
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
	
	
}
public class OrderRevenueSummary {

	public static void main(String[] args) {
		ArrayList<Customer> customers=new ArrayList<>();
		customers.add(new Customer("Sumit",25.25));
		customers.add(new Customer("Rahul",50.26));
		
		Map<String,Double> group=customers.stream().collect(Collectors.groupingBy(Customer::getName,Collectors.summingDouble(Customer::getPrice)));
		System.out.println(group);
		
		
		// TODO Auto-generated method stub

	}

}
