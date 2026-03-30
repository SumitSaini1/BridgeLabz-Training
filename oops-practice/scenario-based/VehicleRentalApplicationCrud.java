
import java.util.ArrayList;
import java.util.Scanner;

class Vehicle  {
	protected int id;
	protected String vehicleName;
	protected String vehicleCompany;
	protected String vehicleType;
	protected String vehicleNumber;
	
	public Vehicle(int id,String vehicleName,String vehicleCompany,String vehicleType,String vehicleNumber){
		this.id=id;
		this.vehicleName=vehicleName;
		this.vehicleCompany=vehicleCompany;
		this.vehicleType=vehicleType;
		this.vehicleNumber=vehicleNumber;
	}
	public int getVehicleId() {
		return id;
	}
	
	public String getVehicleName() {
		return vehicleName;
		
	}
	public String getVehicleCompany() {
		return vehicleCompany;
		
	}
	public String getVehicleType() {
		return vehicleType;
		
	}
	public String getVehicleNumber() {
		return vehicleNumber;
		
	}
	public void displayVehicle() {
		System.out.println("================Vehicle Details========================");
	    System.out.println("Vehicle Name    : " + vehicleName);
	    System.out.println("Company         : " + vehicleCompany);
	    System.out.println("Type            : " + vehicleType);
	    System.out.println("Vehicle Number  : " + vehicleNumber);
	}
	public void display() {
		displayVehicle();
	}

}

interface IRentable{
	public void CalculateRent(int days);
}
class Bike extends Vehicle implements IRentable{
	private String engineModel;
	private String modelYear;
	private int engineCC;
	private int insuranceNumber;
	public Bike(String engineModel,String modelYear,int engineCC,int insuranceNumber,int id,String vehicleName,String vehicleCompany,String vehicleType,String vehicleNumber) {
		super(id,vehicleName,vehicleCompany,vehicleType,vehicleNumber);
		this.engineModel=engineModel;
		this.modelYear=modelYear;
		this.engineCC=engineCC;
		this.insuranceNumber=insuranceNumber;
		
		
	}
	
	@Override
    public void CalculateRent(int days) {
        int rent = days * 300;
        System.out.println("Bike Rent for " + days + " days = ₹" + rent);
    }
	
	public void displayBike() {
		super.display();
	    System.out.println("Engine Model    : " + engineModel);
	    System.out.println("Model Year        : " + modelYear);
	    System.out.println("Engine CC            : " + engineCC);
	    System.out.println("Vehicle Number  : " + vehicleNumber);
	}
	public void display() {
		displayBike();
	}
	
	
	
	
	
}
class Car extends Vehicle implements IRentable {

    private String fuelType;
    private int seatingCapacity;
    private String transmissionType;
    private int insuranceNumber;
    
    

    public Car(String fuelType,
               int seatingCapacity,
               String transmissionType,
               int insuranceNumber,int id,
               String vehicleName,
               String vehicleCompany,
               String vehicleType,
               String vehicleNumber) {

        super(id,vehicleName, vehicleCompany, vehicleType, vehicleNumber);
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
        this.transmissionType = transmissionType;
        this.insuranceNumber = insuranceNumber;
    }
    @Override
    public void CalculateRent(int days) {
        int rent = days * 300;
        System.out.println("Bike Rent for " + days + " days = ₹" + rent);
    }

    // Getters
    public String getFuelType() {
        return fuelType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    // Display methods
    public void displayCar() {
        super.display();
        System.out.println("Fuel Type        : " + fuelType);
        System.out.println("Seating Capacity : " + seatingCapacity);
        System.out.println("Transmission     : " + transmissionType);
        System.out.println("Insurance Number : " + insuranceNumber);
    }

    @Override
    public void display() {
        displayCar();
    }
}
class Truck extends Vehicle  implements IRentable {

    private int loadCapacity;   
    private int numberOfAxles;
    private String permitType;
    private int insuranceNumber;

    public Truck(int loadCapacity,
                 int numberOfAxles,
                 String permitType,
                 int insuranceNumber,int id,
                 String vehicleName,
                 String vehicleCompany,
                 String vehicleType,
                 String vehicleNumber) {

        super(id,vehicleName, vehicleCompany, vehicleType, vehicleNumber);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.permitType = permitType;
        this.insuranceNumber = insuranceNumber;
    }
    
    @Override
    public void CalculateRent(int days) {
        int rent = days * 300;
        System.out.println("Bike Rent for " + days + " days = ₹" + rent);
    }


    // Getters
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public String getPermitType() {
        return permitType;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    // Display methods
    public void displayTruck() {
        super.display();
        System.out.println("Load Capacity    : " + loadCapacity + " tons");
        System.out.println("Number of Axles  : " + numberOfAxles);
        System.out.println("Permit Type     : " + permitType);
        System.out.println("Insurance Number: " + insuranceNumber);
    }

    @Override
    public void display() {
        displayTruck();
    }
}

class BikeCrud{
	private ArrayList<Bike> bikes=new ArrayList<>();
	
	
	Scanner input=new Scanner(System.in);
	
	// CRUD ON BIKE 
	// add a bike;
	public void addBike(Bike bike) {
		bikes.add(bike);
	}
	// update name
	public void updateNameById(int id ,String newVehicleName) {
		if(bikes.isEmpty()) {
			System.out.print("No bike found to edit ");
			return;
		}
		for(Bike b: bikes) {
			if(b.id==id) {
				b.vehicleName=newVehicleName;
				System.out.print("Update SuccessFully");
				return;
			}else {
				System.out.print("This id vehicle is not available ");
			}
			
		}
		
	}
	// display all bikes 
	public void displayBikes() {
		if(bikes.isEmpty()) {
			System.out.print("No bike found to display");
			return;
		}
		for(Bike b: bikes) {
			b.display();			
		}
		
		
		
	}
	// delete bike by id 
	public void deleteBike(int id) {
		if(bikes.isEmpty()) {
			System.out.print("No bike");
			return;
		}
		for(int i=0;i<bikes.size();i++) {
			if(bikes.get(i).getVehicleId()==id) {
				bikes.remove(i);
			}
		}
		
	}
	
	
	
}



class CarCrud {

    private ArrayList<Car> cars = new ArrayList<>();

    // ADD
    public void addCar(Car car) {
        cars.add(car);
    }

    // UPDATE name by id
    public void updateNameById(int id, String newName) {
        if (cars.isEmpty()) {
            System.out.println("No car found");
            return;
        }

        for (Car c : cars) {
            if (c.id == id) {
                c.vehicleName = newName;
                System.out.println("Car name updated successfully");
                return;
            }
        }
        System.out.println("Car with this id not found");
    }

    // DISPLAY
    public void displayCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars available");
            return;
        }

        for (Car c : cars) {
            c.display();
        }
    }

    // DELETE
    public void deleteCar(int id) {
        if (cars.isEmpty()) {
            System.out.println("No cars to delete");
            return;
        }

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getVehicleId() == id) {
                cars.remove(i);
                System.out.println("Car deleted successfully");
                return;
            }
        }
        System.out.println("Car id not found");
    }
}



class TruckCrud {

    private ArrayList<Truck> trucks = new ArrayList<>();

    // ADD
    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    // UPDATE name by id
    public void updateNameById(int id, String newName) {
        if (trucks.isEmpty()) {
            System.out.println("No truck found");
            return;
        }

        for (Truck t : trucks) {
            if (t.id == id) {
                t.vehicleName = newName;
                System.out.println("Truck name updated successfully");
                return;
            }
        }
        System.out.println("Truck with this id not found");
    }

    // DISPLAY
    public void displayTrucks() {
        if (trucks.isEmpty()) {
            System.out.println("No trucks available");
            return;
        }

        for (Truck t : trucks) {
            t.display();
        }
    }

    // DELETE
    public void deleteTruck(int id) {
        if (trucks.isEmpty()) {
            System.out.println("No trucks to delete");
            return;
        }

        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getVehicleId() == id) {
                trucks.remove(i);
                System.out.println("Truck deleted successfully");
                return;
            }
        }
        System.out.println("Truck id not found");
    }
}

public class VehicleRentalApplicationCrud {

    public static void main(String[] args) {

        // CREATE CRUD OBJECTS
        BikeCrud bikeCrud = new BikeCrud();
        CarCrud carCrud = new CarCrud();
        TruckCrud truckCrud = new TruckCrud();

        // ================= BIKE =================
        Bike bike1 = new Bike(
                "BS6", "2023", 150, 1111,
                1, "Apache", "TVS", "Bike", "UP16AB1234"
        );

        Bike bike2 = new Bike(
                "BS4", "2022", 125, 2222,
                2, "Pulsar", "Bajaj", "Bike", "DL10CD5678"
        );

        bikeCrud.addBike(bike1);
        bikeCrud.addBike(bike2);

        System.out.println("\n--- ALL BIKES ---");
        bikeCrud.displayBikes();

        bikeCrud.updateNameById(1, "Apache RTR");

        System.out.println("\n--- AFTER BIKE UPDATE ---");
        bikeCrud.displayBikes();

        bikeCrud.deleteBike(2);

        System.out.println("\n--- AFTER BIKE DELETE ---");
        bikeCrud.displayBikes();

        // ================= CAR =================
        Car car1 = new Car(
                "Petrol", 5, "Automatic", 3333,
                3, "Swift", "Maruti", "Car", "HR26EF1111"
        );

        Car car2 = new Car(
                "Diesel", 7, "Manual", 4444,
                4, "Innova", "Toyota", "Car", "UP14GH2222"
        );

        carCrud.addCar(car1);
        carCrud.addCar(car2);

        System.out.println("\n--- ALL CARS ---");
        carCrud.displayCars();

        carCrud.updateNameById(3, "Swift Dzire");

        System.out.println("\n--- AFTER CAR UPDATE ---");
        carCrud.displayCars();

        carCrud.deleteCar(4);

        System.out.println("\n--- AFTER CAR DELETE ---");
        carCrud.displayCars();

        // ================= TRUCK =================
        Truck truck1 = new Truck(
                10, 6, "National", 5555,
                5, "Ashok Leyland", "AL", "Truck", "RJ19JK3333"
        );

        Truck truck2 = new Truck(
                15, 8, "State", 6666,
                6, "Tata Prima", "Tata", "Truck", "MH12LM4444"
        );

        truckCrud.addTruck(truck1);
        truckCrud.addTruck(truck2);

        System.out.println("\n--- ALL TRUCKS ---");
        truckCrud.displayTrucks();

        truckCrud.updateNameById(5, "Ashok Leyland 2518");

        System.out.println("\n--- AFTER TRUCK UPDATE ---");
        truckCrud.displayTrucks();

        truckCrud.deleteTruck(6);

        System.out.println("\n--- AFTER TRUCK DELETE ---");
        truckCrud.displayTrucks();

        // ================= RENT DEMO =================
        System.out.println("\n--- RENT CALCULATION ---");
        bike1.CalculateRent(3);
        car1.CalculateRent(2);
        truck1.CalculateRent(1);
    }
}




	



