
class Device {
    // instance variable
    protected int deviceId;
    protected String status;
    // constructor
    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;

    }

}
// class Thermostat inherit Device class  
class Thermostat extends Device {
    
    String temperatureSetting;
    // CONSTRUCTOR 
    Thermostat(String temperatureSetting, int deviceId, String status) {
        // call parent constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("deviceId:" + deviceId);
        System.out.println("Status:" + status);
        System.out.println("Temperature Setting:" + temperatureSetting);

    }

}
// main clas 
public class SmartHomeDevices {

    public static void main(String[] args) {
        // create object 
        Thermostat obj = new Thermostat("High", 123, "On");
        // call display function 
        System.out.println("-----------------DEVICE STATUS ----------------------------");
        obj.displayStatus();

    }

}
