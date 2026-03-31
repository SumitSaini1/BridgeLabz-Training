package FunctionalInterface;

interface function{
	public void turnOn();
	public void turnOff();
		
}
class AC implements function{
	public void turnOn() {
		System.out.println("Ac is on");
	}
	public void turnOff() {
		System.out.println("Ac is off");
	}
}

class TV implements function{
	public void turnOn() {
		System.out.println("TV is on");
	}
	public void turnOff() {
		System.out.println("TV is off");
	}
}

public class SmartDeviceControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
		
		AC ac=new AC();
		ac.turnOn();
		ac.turnOff();
		

	}

}
