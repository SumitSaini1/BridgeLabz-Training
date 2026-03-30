class Vehicle {
    // static 
    static int registrationFee=5000;
    // instance variable 
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    // constructor 
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {

        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // display 
    void display() {
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Vehicle Type:"+ vehicleType);
        System.out.println("Registration Number:"+registrationNumber);
        System.out.println("Registration Fee:"+registrationFee);


    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;

    }

}



public class VehicleRegistration {
    public static void main(String[] args) {

        // object 1
        Vehicle v= new Vehicle("Aditya", "Four Wheeler", 12563);
        
        if(v instanceof Vehicle){
            System.out.println("-------------------Shoping Cart-------------------------------");
            v.display();
            
        }else{
            System.out.println("onject not belongs to Employee object ");
        }
        System.out.println("-----------------------------------------------------------------------");
        Vehicle.updateRegistrationFee(3000);

        Vehicle v2= new Vehicle("Rahul", "Four Wheeler", 28896);
        v2.display();




    }

}
