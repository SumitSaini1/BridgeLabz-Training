import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

// Abstract class
abstract class Vehicle implements Insurable {
    private String insurancePolicyNumber;
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    public abstract double calculateRentalCost(int days);

    protected String getPolicyNumber() {
        return insurancePolicyNumber;
    }

    public void displayDetails(int days) {
        System.out.println("--------------------------------");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + type);
        System.out.println("Rental Cost    : " + calculateRentalCost(days));
        System.out.println("Insurance Cost : " + calculateInsurance(days));
        System.out.println("Insurance Info : " + getInsuranceDetails());
    }
}

// Car class
class Car extends Vehicle {
    Car(String vehicleNumber, double rate, String policyNumber) {
        super(vehicleNumber, "Car", rate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance(int days) {
        return days * 100;
    }

    public String getInsuranceDetails() {
        return "Car Insurance | Policy No: " + getPolicyNumber();
    }
}

// Bike class
class Bike extends Vehicle {
    Bike(String vehicleNumber, double rate, String policyNumber) {
        super(vehicleNumber, "Bike", rate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance(int days) {
        return days * 50;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance | Policy No: " + getPolicyNumber();
    }
}

// Truck class
class Truck extends Vehicle {
    Truck(String vehicleNumber, double rate, String policyNumber) {
        super(vehicleNumber, "Truck", rate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days + 500;
    }

    public double calculateInsurance(int days) {
        return days * 200;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + getPolicyNumber();
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-11"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-22"));
        vehicles.add(new Truck("TRUCK303", 3000, "TRUCK-INS-33"));

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails(rentalDays);
        }
    }
}
