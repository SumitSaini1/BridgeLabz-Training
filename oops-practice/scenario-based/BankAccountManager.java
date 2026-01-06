
import java.util.*;

class BankAccount {
    double balance = 0;

    public void depositBalance(double amount) {
        balance += amount;

    }
    // withdraw money
    public void withdrawAmount(double withdraw) {

        if (withdraw > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdraw;
            System.out.println("Money Withdraw Successfully ");
        }

    }
    // get balance 
    public double getBalance() {
        return balance;
    }

}
// main class
public class BankAccountManager {

    public static void main(String[] args) {
        // create object 
        Scanner input = new Scanner(System.in);
        BankAccount obj = new BankAccount();

        System.out.println("Enter amount to deposit:");
        double amount = input.nextDouble();
        // check amount 
        while (amount <= 0) {
            System.out.println("Enter  amount again:");
            // re enter 
            amount = input.nextDouble();
        }

        obj.depositBalance(amount);

        System.out.println("Enter Withdraw amount: ");
        double withdraw = input.nextDouble();
        while (withdraw <= 0) {
            System.out.println("Enter again Withdraw amount: ");

            withdraw = input.nextDouble();
        }

        obj.withdrawAmount(withdraw);

        double balance = obj.getBalance();
        System.out.println("Balance:" + balance);
        input.close();

    }

}
