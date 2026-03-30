public class CarRentalSystem {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int costPerDay = 1000;
    private int totalRent = 0;

    CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void totalRentalCost() {
        totalRent = costPerDay * rentalDays;
        
       

    }
    void display(){
        System.out.println("--------------------RENT DETAILS------------------------------");
        System.out.println("Customer Name:"+customerName+ "\nCar Model:"+ carModel+"\nRental Days:"+ rentalDays+"\nCost Per Day:"+costPerDay+"Total Rent:"+totalRent);
    }
    public static void main(String[] args) {
        CarRentalSystem car = new CarRentalSystem("Sumit", "Swift", 5);
        car.totalRentalCost();
        car.display();
        
    }

}
