
public class ThrowVsThrows {
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 1 || rate < 1) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");

        } else {
            System.out.println("Calculated Interest:");
        }

    }

    public static void main(String[] args) {
        try{
            calculateInterest(2500, 8, 0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
