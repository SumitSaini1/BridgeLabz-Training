class ParkingSystem {

    int big;
    int medium;
    int small;

    // constructor
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    // method to add car
    public boolean addCar(int carType) {

        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }

        return false;
    }

    
}
public class DesignParkingSystem{
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 1, 0);

        System.out.println(ps.addCar(1)); 
        System.out.println(ps.addCar(2)); 
        System.out.println(ps.addCar(3)); 
        System.out.println(ps.addCar(1)); 
    }
