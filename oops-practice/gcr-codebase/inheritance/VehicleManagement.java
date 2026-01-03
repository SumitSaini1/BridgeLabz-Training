class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;

    }
}

// interface
interface Refuelable {
    public void refuel();
}

class ElectricVehicle {
    void charge() {
        System.out.println("Vehicle is charging");
    }

}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    @Override
    public void refuel() {
        System.out.println("Low fuel");
    }

}

public class VehicleManagement {

    public static void main(String[] args) {
        PetrolVehicle petrolCar = new PetrolVehicle(180, "Honda City");

        // Access inherited data
        System.out.println("Model: " + petrolCar.model);
        System.out.println("Max Speed: " + petrolCar.maxSpeed);

        // Call interface method
        petrolCar.refuel();

        // Object of ElectricVehicle
        ElectricVehicle ev = new ElectricVehicle();
        ev.charge();

    }
}
