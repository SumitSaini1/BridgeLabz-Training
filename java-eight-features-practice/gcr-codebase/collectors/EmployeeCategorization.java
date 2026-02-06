package collectors;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
class Employee{
	private String name;
	private String department;
	private double salary;
	
	
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class EmployeeCategorization {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee("Sumit","MCA",5250.256));
		employees.add(new Employee("Sumit","MCA",5690.25));
		employees.add(new Employee("Rahul","Btech",8550.256));
		employees.add(new Employee("Aditya","Btech",985.5));
		
		Map<String , Double> avgSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		// TODO Auto-generated method stub

	}

}
