
import java.util.*;

class BankAccount {
    double balance = 0;

    public void depositBalance(double amount) {
        balance += amount;

    }

    public void withdrawAmount(double withdraw) {

        if (withdraw > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdraw;
            System.out.println("Money Withdraw Successfully ");
        }

    }

    public double getBalance() {
        return balance;
    }

}

public class BankAccountManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount obj = new BankAccount();

        System.out.println("Enter amount to deposit:");
        double amount = input.nextDouble();
        while (amount <= 0) {
            System.out.println("Enter  amount again:");

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

    }

}
