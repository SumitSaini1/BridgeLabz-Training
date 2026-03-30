package EmployeeRolePolymorphism;

class Developer extends Employee{
	private double totalBonus=0;
	private int bonus=0;
	Developer(String name,double salary,String role){
		super(name,salary,role);
	}
	void getBonus() {
		double salary=super.getSalary();
		if(salary>50000) {
			bonus=5;
			totalBonus=(salary*bonus)/100;
			
		}
		
		
		
		
		
		
	}
	public double getTotalBonus() {
		return totalBonus;
	}
	public void display() {
		System.out.println("==========Employee Details:============");
		super.display();
		System.out.println("Employee Bonus:"+getTotalBonus());
	}
}