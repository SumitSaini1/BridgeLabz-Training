package SmartCheckout;
import java.util.*;
public class Service {
	Queue<Customer> customers=new LinkedList<>();
	HashMap<String,Item> items=new HashMap<>();
	
	// add customer
	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}
	// remove customer from queue
	public Customer removeCustomer() {
		if(customers.isEmpty() ) {
			
			return null;
		}
		Customer customer=customers.poll();
		return customer;
	}
	
	// add item
	public void addItem(Item item) {
		String name=item.getItemName();
		items.put(name,item);
		
	}
	
	
	public void buyProducts() {
		Customer customer=removeCustomer();
		if(customer==null) {
			System.out.println("No Customers Available");
			return;
		}
		ArrayList<String> listItem=customer.getItems();
		
		if(listItem.isEmpty()) {
			System.out.println("No items found for current customer");
			return;
		}
		double price=calculatePriceAndUpdateStocks(listItem);
		System.out.println("You Purchase SuccessFully");
		System.out.println("Total Price:"+price);
		
	}
	// price Calculate
	public double calculatePriceAndUpdateStocks(ArrayList<String> listItem){
		double Totalprice=0;
		for(String item: listItem) {
			Item product=items.get(item);
			 if (product == null) {
		            System.out.println(item + " not found in store");
		            continue;
		        }
			 if (product.getStock() <= 0) {
	                System.out.println(item + " is out of stock");
	                continue;
	          }
			Totalprice+=product.getPrice();
			product.setStock((product.getStock()-1));			
		}
		return Totalprice;
	}
		
	
	
	
	
	
	

}
