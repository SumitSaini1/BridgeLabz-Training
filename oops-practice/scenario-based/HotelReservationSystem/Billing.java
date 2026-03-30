package oops.scenario.HotelReservationSystem;
interface PricingStrategy{
    public double normalDays(int days,double price);
    public double seasonalDays(int days,double price);
}
public class Billing implements PricingStrategy{ 
    public double normalDays(int days,double price){
        double totalBill=days*price;
        return totalBill;


    }
    public double seasonalDays(int days,double price){
        double totalBill=days*price+200;
        return totalBill;


    }



}