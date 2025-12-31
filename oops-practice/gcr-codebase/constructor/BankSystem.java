// Parent class
class BankAccount {

    public String accountNumber;     // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }
}

// Child class
class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);   
        
    }
}

public class BankSystem {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount("98465454", "Sumit", 5000);

        account.displayAccountInfo();

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
