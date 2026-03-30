// abstract parent class
abstract class BankAccount {

    // private variables (encapsulation)
    private int accountNumber;
    private String holderName;
    private double balance;

    // constructor
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // abstract method
    abstract void calculateInterest();

    // display details
    void displayDetails() {
        System.out.println("---------------Account Details----------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// interface
interface Loanable {
    void applyForLoan();
    void calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {

    static final double INTEREST_RATE = 4.0;
    double interest;

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // calculate interest
    void calculateInterest() {
        interest = (getBalance() * INTEREST_RATE) / 100;
    }

    public void applyForLoan() {
        System.out.println("Loan applied under Savings Account");
    }

    public void calculateLoanEligibility() {
        System.out.println("Eligible Loan Amount: " + (getBalance() * 5));
    }

    // override display
    void displayDetails() {
        calculateInterest();
        super.displayDetails();
        System.out.println("Interest Earned: " + interest);
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {

    static final double INTEREST_RATE = 2.0;
    double interest;

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    void calculateInterest() {
        interest = (getBalance() * INTEREST_RATE) / 100;
    }

    public void applyForLoan() {
        System.out.println("Loan applied under Current Account");
    }

    public void calculateLoanEligibility() {
        System.out.println("Eligible Loan Amount: " + (getBalance() * 3));
    }

    void displayDetails() {
        calculateInterest();
        super.displayDetails();
        System.out.println("Interest Earned: " + interest);
    }
}

// main class
public class BankingSystem {

    public static void main(String[] args) {

        // polymorphism
        BankAccount acc1 = new SavingsAccount(101, "Rahul", 50000);
        BankAccount acc2 = new CurrentAccount(102, "Amit", 800000);

        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayDetails();

        System.out.println();

        acc2.deposit(10000);
        acc2.withdraw(15000);
        acc2.displayDetails();

        System.out.println();

        // interface reference
        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan();
        loan1.calculateLoanEligibility();
    }
}
