package oops.scenario.DigitalWalletSystem;

// thrown when balance is not enough
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
