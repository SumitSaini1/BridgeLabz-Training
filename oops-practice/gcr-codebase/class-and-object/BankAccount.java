class BankAccount {

    // instance variables to store account details
    String accountHolder;
    String accountNumber;
    double balance;

    // method to deposit money
    void deposit(double amount) {

        // add deposit
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    // method to withdraw money
    void withdraw(double amount) {

        // check if sufficient balance 
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw amount is : " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // method to display current balance
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {

        // create bank account object
        BankAccount account = new BankAccount();

        // assign account details
        account.accountHolder = "State of Chennai";
        account.accountNumber = "SB001";
        account.balance = 700.0;

        // display initial balance
        System.out.println(account.accountHolder);
        account.displayBalance();

        // deposit money
        account.deposit(200.0);

        // withdraw money
        account.withdraw(100.0);

        
        account.withdraw(1000.0);
    }
}
