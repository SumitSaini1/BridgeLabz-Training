
public class HotelBooking {
    // instance variables
    static String guestName;
    static String roomType;
    static int nights;
    // parameterized constructor
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;


    }
    // copy constuctor
    HotelBooking(HotelBooking h1){
        guestName=h1.guestName;
        roomType=h1.roomType;
        nights=h1.nights;
    }
    // display records
    void display(){
        System.out.println("GuestName: "+guestName + "\nRoom Type:"+ roomType +"\nNights:"+nights);
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        // create object 1.
        HotelBooking h1=new HotelBooking("Rahul","Premium",2);
        //// create object 2 and passed object 1 as a parameter 
        HotelBooking h2=new HotelBooking(h1);
        System.out.println("parameterized constructor called");
        h1.display();
        System.out.println("Copy Constructor called");
        h2.display();

        

    }
    
}
