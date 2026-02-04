package FunctionalInterface;

interface Feature{
	public void displaySpeed();
	default void displayBattery() {
		System.out.println("Battery is charged");
	}
	
}
class ElecticVehicle implements Feature{
	public void displaySpeed() {
		System.out.println("Normal Speed Currently");
	}
	
	
}
public class SmartVehicleDashboard {

	public static void main(String[] args) {
		ElecticVehicle e=new ElecticVehicle();
		e.displaySpeed();
		e.displayBattery();

	}

}
