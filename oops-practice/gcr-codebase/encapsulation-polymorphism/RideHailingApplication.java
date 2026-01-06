// abstract parent class
abstract class Vehicle {

    // encapsulated fields
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // constructor
    Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // abstract method
    abstract double calculateFare(double distance);

    // concrete method
    void getVehicleDetails() {
        System.out.println("---------------Vehicle Details----------------");
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }
}

// interface
interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car class
class Car extends Vehicle implements GPS {

    String location;

    Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public void getCurrentLocation() {
        System.out.println("Car Current Location: " + location);
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

// Bike class
class Bike extends Vehicle implements GPS {

    String location;

    Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    double calculateFare(double distance) {
        return (getRatePerKm() * distance) - 20;
    }

    public void getCurrentLocation() {
        System.out.println("Bike Current Location: " + location);
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

// Auto class
class Auto extends Vehicle implements GPS {

    String location;

    Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 30;
    }

    public void getCurrentLocation() {
        System.out.println("Auto Current Location: " + location);
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

// main class
public class RideHailingApplication {

    // polymorphic fare calculator
    static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
        System.out.println();
    }

    public static void main(String[] args) {

        // polymorphism
        Vehicle v1 = new Car(101, "Rahul", 15);
        Vehicle v2 = new Bike(102, "Amit", 10);
        Vehicle v3 = new Auto(103, "Suresh", 12);

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
        calculateRideFare(v3, 10);

        // interface reference
        GPS gps = (GPS) v1;
        gps.updateLocation("MG Road");
        gps.getCurrentLocation();
    }
}
