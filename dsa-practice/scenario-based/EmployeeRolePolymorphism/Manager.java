package EmployeeRolePolymorphism;

class Manager extends Employee{
	static final int BONUS_PERCENT=10;
	private double totalBonus;
	Manager(String name,double salary,String role){
		super(name,salary,role);
	}
	void getBonus() {
		double salary=super.getSalary();
		totalBonus=(salary*BONUS_PERCENT)/100;
		
		
		
		
		
	}
	public double getTotalBonus() {
		return totalBonus;
	}
	public static int getBonusPercent() {
		return BONUS_PERCENT;
	}
	
	public void display() {
		System.out.println("==========Employee Details:============");
		super.display();
		System.out.println("Employee Bonus:"+getTotalBonus());
	}
	
	
}