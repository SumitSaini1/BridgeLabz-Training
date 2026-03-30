package oops.scenario.HotelReservationSystem;

public class Guest{
    private int guestId;
    private String guestName;
    private int age;
    private String gender;
    private int noOfDays;
   
    
    public Guest(int guestId,String guestName,int age,String gender,int noOfDays){
        this.guestId=guestId;
        this.guestName=guestName;
        this.age=age;
        this.gender=gender;
        this.noOfDays=noOfDays;
        


    }
    public int getNoOfDays(){
        return noOfDays;
    }
    public void displayGuest(){
        System.out.println("----- Guest Details -----");
        System.out.println("Guest ID     : " + guestId);
        System.out.println("Name         : " + guestName);
        System.out.println("Age          : " + age);
        System.out.println("Gender       : " + gender);
        System.out.println("Stay (Days)  : " + noOfDays);
    }
    

}
