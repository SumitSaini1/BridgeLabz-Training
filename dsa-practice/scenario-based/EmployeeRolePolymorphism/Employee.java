package EmployeeRolePolymorphism;

abstract class Employee{
	private String name;
	private double salary;
	private String role;
	Employee(String name,double salary,String role){
		this.name=name;
		this.salary=salary;
		this.role=role;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public  void display() {
		System.out.println("Name"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Role:"+role);
		
	}
	abstract void getBonus();
	
}