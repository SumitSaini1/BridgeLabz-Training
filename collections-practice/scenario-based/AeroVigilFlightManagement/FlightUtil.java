package AeroVigilFlightManagement;
import java.util.*;
public class FlightUtil {
	private String flightNumber;
	private String flightName;
	private int passengerCount;
	private double currentFuelLevel;
	
	static HashMap<String,HashSet<FlightUtil> > flights=new HashMap<>();
	
	private final static int MAX_CAPACITY_SPICEJET=396;
	private final static int MAX_CAPACITY_VISTARA=615;
	private final static int MAX_CAPACITY_INDIGO=230;
	private final static int MAX_CAPACITY_AIRARABIA=130;
	
	
	
	
	
	public FlightUtil(String flightNumber,String flightName,int passengerCount ) throws InvalidFlightException {
		// check validation for flight number
		if(validateFlightNumber(flightNumber)) {
			this.flightNumber=flightNumber;
			
		}else {
			throw new InvalidFlightException("The flight number " + flightNumber + "is invalid");
		}
		// check validation for flight name
		if(validateFlightName(flightName)) {
			this.flightName=flightName;
		}else {
			throw new InvalidFlightException("The flight name " + flightName + "is invalid");
			
		}
		// check validation for passenger count 
		if(validatePassengerCount(passengerCount, flightName)) {
			this.passengerCount=passengerCount;
		}else {
			throw new InvalidFlightException("The flight passenger count  " + passengerCount+ "is invalid");
			
		}
		
		
		
	}
	
	public boolean validateFlightNumber(String flightNumber) {
		String regex="^FL-[1-9]{1}[0-9]{3}$";
		if(flightNumber.matches(regex)) {
			return true;
		}
		return false;
		
	}
	public boolean validateFlightName(String flightName) {
		if(flightName.equalsIgnoreCase("SpiceJet")) {
			return true;
		}else if(flightName.equalsIgnoreCase("Vistara")) {
			return true;
		}
		else if(flightName.equalsIgnoreCase("IndiGo")) {
			return true;
		}else if(flightName.equalsIgnoreCase("Air Arabia")) {
			return true;
		}
		return false;
		
	}

	public boolean validatePassengerCount(int passengerCount, String flightName) {
		if(flightName.equalsIgnoreCase("Vistara") && (passengerCount > 0 && passengerCount <= MAX_CAPACITY_VISTARA )){
			return true;
			
			
		}
		if(flightName.equalsIgnoreCase("SpiceJet") && (passengerCount > 0 && passengerCount <= MAX_CAPACITY_SPICEJET )){
			
			return true;
			
			
		}
		if(flightName.equalsIgnoreCase("IndiGo") && (passengerCount > 0 && passengerCount <= MAX_CAPACITY_INDIGO )){
			return true;
			
			
		}
		if(flightName.equalsIgnoreCase("Air Arabia") && (passengerCount > 0 && passengerCount <= MAX_CAPACITY_AIRARABIA )){
			
			return true;
			
			
		}
		return false;
		
		
		
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel)
	        throws InvalidFlightException {

	    if (currentFuelLevel < 0) {
	        throw new InvalidFlightException("Fuel level cannot be negative");
	    }

	    if (flightName.equalsIgnoreCase("Vistara")) {
	        if (currentFuelLevel <= 200000) {
	            return 200000 - currentFuelLevel;
	        }
	    }

	    if (flightName.equalsIgnoreCase("SpiceJet")) {
	        if (currentFuelLevel <= 300000) {
	            return 300000 - currentFuelLevel;
	        }
	    }

	    if (flightName.equalsIgnoreCase("IndiGo")) {
	        if (currentFuelLevel <= 250000) {
	            return 250000 - currentFuelLevel;
	        }
	    }

	    if (flightName.equalsIgnoreCase("Air Arabia")) {
	        if (currentFuelLevel <= 150000) {
	            return 150000 - currentFuelLevel;
	        }
	    }

	    throw new InvalidFlightException("The fuel level exceeds tank capacity for " + flightName);
	}
	

	public void add(FlightUtil util) {
		String name=util.flightName;
		if(flights.containsKey(name)) {
			flights.get(name).add(util);
			System.out.println("added");
		}else {
			flights.put(name,new HashSet<>());
			flights.get(name).add(util);
			System.out.println("added");
			
		}
		
	}
	

}
