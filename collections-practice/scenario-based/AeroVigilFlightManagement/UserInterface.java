package AeroVigilFlightManagement;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		
		System.out.println("Enter Flight Details");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		String[] details=input.split(":");
		
		
		try {
			if(details.length<4 || details.length > 4) {
				throw new IllegalArgumentException("Invalid Input:");
			}
			FlightUtil obj=new FlightUtil(details[0],details[1],Integer.parseInt(details[2]));

			double remaining=obj.calculateFuelToFillTank(details[1], Double.parseDouble(details[3]));
			System.out.println("Fuel required to fill the tank:" + remaining+" liters");
			obj.add(obj);

			
			
			
		}catch(InvalidFlightException e) {
			System.out.println(e.getMessage());
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
