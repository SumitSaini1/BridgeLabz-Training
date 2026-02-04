package FunctionalInterface;
interface Vehicle {
    void rent();
    void returnVehicle();
}
class Car implements Vehicle {
    public void rent() {
        System.out.println("Car has been rented");
    }

    public void returnVehicle() {
        System.out.println("Car has been returned");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike has been rented");
    }

    public void returnVehicle() {
        System.out.println("Bike has been returned");
    }
}


class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus has been rented");
    }

    public void returnVehicle() {
        System.out.println("Bus has been returned");
    }
}


public class MultiVehicleRentalSystem {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();

	}

}
