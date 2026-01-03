

class  BankAccount{
    // instance 
	int accountNumber;
	float balance;
    // counstructor 
	BankAccount(int accountNumber,float balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	
	void displayInfo() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance:"+balance);
		
	}
	
	

	
}

class SavingsAccount extends BankAccount{
	static int interestRate=5;
    // constructor
	SavingsAccount(int interestRate,int accountNumber,float balance){
        // call super constructor 
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	void displayInfo() {
		System.out.println("-----------------------SavingsAccount Details -----------------------");
		super.displayInfo();
		
		System.out.println("Interest Rate:"+interestRate);
		
	}
	
}

class  CheckingAccount extends BankAccount{
	int withdrawalLimit;
    //constructor 
	CheckingAccount(int withdrawalLimit,int accountNumber,float balance){
         // call super constructor 
		super(accountNumber,balance);
		this.withdrawalLimit=withdrawalLimit;
		
	}
	void displayInfo() {
		System.out.println("-----------------------CheckingAccount Details-----------------------");
		super.displayInfo();
		
		System.out.println("withdrawalLimit:"+withdrawalLimit);
		
		
	}
	

	
}

class FixedDepositAccount extends BankAccount{
	int fixedBalance;
	// constructor 
	FixedDepositAccount(int fixedBalance,int accountNumber,float balance){
        // // call super constructor 
		super(accountNumber,balance);
		this.fixedBalance=fixedBalance;
		
	}
	
	void displayInfo() {
		System.out.println("-----------------------FixedDepositAccount Details-----------------------");
		
		super.displayInfo();
		
		System.out.println("Fixed Balance:"+fixedBalance);
		
	}
	
}
public class BankAccountTypes {

	public static void main(String[] args) {
		// Savings Account object
        SavingsAccount savings = new SavingsAccount(5, 101, 5000.0f);
        savings.displayInfo();

        System.out.println();

        // Checking Account object
        CheckingAccount checking = new CheckingAccount(2000, 102, 8000.0f);
        checking.displayInfo();

        System.out.println();

        // Fixed Deposit Account object
        FixedDepositAccount fixed = new FixedDepositAccount(100000, 103, 20000.0f);
        fixed.displayInfo();
		

        
	}

}
