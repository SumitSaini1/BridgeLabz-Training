package oops.scenario.DigitalWalletSystem;


public class Wallet {
    private double balance;

    public Wallet() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }
}
