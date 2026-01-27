// custom exception for insufficient balance
class InsufficientBalanceException extends Exception {

    // constructor to pass error message to parent exception class
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransaction {

    // method to withdraw amount from balance
    public static void withdraw(double amount) throws InsufficientBalanceException {

        // initial account balance
        double balance = 25;

        // checking for invalid (negative) amount
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // checking if amount is greater than available balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } 
        // withdrawal is successful
        else {
            System.out.println("Withdrawal successful, new balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        try {
            // attempting to withdraw amount
            withdraw(23);
        } 
        // handling invalid amount exception
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } 
        // handling insufficient balance exception
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
