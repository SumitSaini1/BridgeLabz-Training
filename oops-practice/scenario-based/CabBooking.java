import java.util.*;

// ================= USER CLASS =================
class User {
	private int id;
	private String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

// ================= DRIVER CLASS =================
class Driver {
	private int driverId;
	private String driverName;
	private boolean isAvailable;

	public Driver(int driverId, String driverName, boolean isAvailable) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.isAvailable = isAvailable;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}

	public String getDriverName() {
		return driverName;
	}
}

// ================= FARE INTERFACE =================
interface Fare {
	double calculateFare(double distance);
}

// ================= NORMAL DAY FARE =================
class FareOnNormalDays implements Fare {
	public double calculateFare(double distance) {
		return distance * 10; // ₹10 per km
	}
}

// ================= PEAK DAY FARE =================
class FareOnPeakDays implements Fare {
	public double calculateFare(double distance) {
		return distance * 15; // ₹15 per km
	}
}

// ================= CUSTOM EXCEPTION =================
class NoDriverAvailableException extends Exception {
	public NoDriverAvailableException(String message) {
		super(message);
	}
}

// ================= RIDE CLASS =================
class Ride {
	private User user;
	private Driver driver;
	private double fare;

	public Ride(User user, Driver driver, double fare) {
		this.user = user;
		this.driver = driver;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "User: " + user.getName() +
		       ", Driver: " + driver.getDriverName() +
		       ", Fare: ₹" + fare;
	}
}

// ================= RIDE SERVICE =================
class RideService {

	private List<User> users = new ArrayList<>();
	private List<Driver> drivers = new ArrayList<>();
	private List<Ride> rideHistory = new ArrayList<>();

	public void addUser(User user) {
		users.add(user);
	}

	public void addDriver(Driver driver) {
		drivers.add(driver);
	}

	public void bookRide(User user, double distance, Fare fareType)
			throws NoDriverAvailableException {

		Driver availableDriver = null;

		for (Driver d : drivers) {
			if (d.isAvailable()) {
				availableDriver = d;
				break;
			}
		}

		if (availableDriver == null) {
			throw new NoDriverAvailableException("No driver available!");
		}

		double totalFare = fareType.calculateFare(distance);
		availableDriver.setAvailable(false);

		Ride ride = new Ride(user, availableDriver, totalFare);
		rideHistory.add(ride);

		System.out.println("Ride booked:" + totalFare);
	}

	public void showRideHistory() {
		System.out.println("\n--- Ride History ---");
		for (Ride r : rideHistory) {
			System.out.println(r);
		}
	}
}


public class CabBooking {

	public static void main(String[] args) {

		RideService service = new RideService();

		
		User u1 = new User(1, "Sumit");
		service.addUser(u1);

		
		Driver d1 = new Driver(101, "Ramesh", true);
		Driver d2 = new Driver(102, "Suresh", true);

		service.addDriver(d1);
		service.addDriver(d2);

		
		Fare normalFare = new FareOnNormalDays();
		Fare peakFare = new FareOnPeakDays();

		try {
			service.bookRide(u1, 10, normalFare); 
			service.bookRide(u1, 5, peakFare);    
		}
		catch (NoDriverAvailableException e) {
			System.out.println(e.getMessage());
		}


		service.showRideHistory();   
	}
}
