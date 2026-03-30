package BankingAccountHierarchy;
public abstract class BankAccount{
	private int accountNumber;
	private double balance;
	BankAccount(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void display() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance:"+balance);
		
	}
}