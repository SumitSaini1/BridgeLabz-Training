class BankAccount {
    private int balance = 10000;

    synchronized boolean withdraw(String name, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction successful: " + name + ", Amount: " + amount + ", Balance: " + balance);
            return true;
        } else {
            System.out.println("Transaction failed: " + name + ", Amount: " + amount + ", Balance: " + balance);
            return false;
        }
    }
}

class Transaction implements Runnable {
    private BankAccount account;
    private String name;
    private int amount;

    Transaction(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        System.out.println("[" + name + "] Attempting to withdraw " + amount);
        account.withdraw(name, amount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        new Thread(new Transaction(account, "Customer-1", 3000)).start();
        new Thread(new Transaction(account, "Customer-2", 4000)).start();
        new Thread(new Transaction(account, "Customer-3", 2000)).start();
        new Thread(new Transaction(account, "Customer-4", 5000)).start();
        new Thread(new Transaction(account, "Customer-5", 1500)).start();
    }
}
