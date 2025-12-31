import java.util.Scanner;

public class VehicleRegistration {
    // instance 
    String ownerName; 
    String vehicleType;
    // class Variable
    static int registrationFee=2500;
    // constructor
    VehicleRegistration(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;



    }
    // display details 
    void displayVehicleDetails(){
        System.out.println("Owner name:"+ownerName+ "\nVehicle Type:"+vehicleType+"\nRegistration Fee:"+ registrationFee);

    }
    // update registration fee
    static void updateRegistrationFee(){
        registrationFee=5000;

    }
    public static void main(String[] args) {
        VehicleRegistration v1=new VehicleRegistration("Sumit ", "Four Wheeler");
        VehicleRegistration v2=new VehicleRegistration("Rahul ", "Two Wheeler");

        v1.displayVehicleDetails();
        System.out.println("--------------------------------------------------------------------------");
        updateRegistrationFee();
        v2.displayVehicleDetails();

        
    }
    
}
