package BankingAccountHierarchy;

class SavingAccount extends BankAccount{
	private double savingsBalance;
	static final double FIXED_PERCENT_FEE=0.5;
	SavingAccount(int accountNumber,double balance,double savingsBalance){
		super(accountNumber,balance);
		this.savingsBalance=savingsBalance;
		
	}
	double calculateFee() {
		double savingFee=(savingsBalance*FIXED_PERCENT_FEE)/100;
		return savingFee;

		
		
		
	}
	void display(){
		System.out.println("Bank Details");
		super.display();
		System.out.println("Saving Balance:"+savingsBalance);
		System.out.println("Saving Fee:"+calculateFee());
	}
	
	
}