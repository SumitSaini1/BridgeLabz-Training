package BankingAccountHierarchy;

class CheckingAccount extends BankAccount {

	CheckingAccount(int accountNumber,double balance){
		super(accountNumber,balance);
		
	}
	double calculateFee() {
		
		if(super.getBalance()<1000) {
			return 1.00;
			
		}
		return 0.00;
	}
	void display(){
		System.out.println("Bank Details");
		super.display();
		System.out.println("Check Balance:"+super.getBalance());
		System.out.println("Checking Fee"+calculateFee());
	}
	
}