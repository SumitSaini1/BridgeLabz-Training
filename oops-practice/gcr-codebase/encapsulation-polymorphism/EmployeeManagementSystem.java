// abstract parent class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    // constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;

    }
    // getter 
    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    // abstract method 
    abstract void calculateSalary();
    // display
    void displayDetails() {
        System.out.println("-----------------------Employee Details--------------------------");
        System.out.println("Employee ID:" + employeeId);
        System.out.println("Name:" + name);
        System.out.println("Base Salary:" + baseSalary);

    }

}
// interface 
interface Department {

    public void assignDepartment(String departmentName);

    public void getDepartmentDetails();
}
// extend Employee class and implement interface department 
class FullTimeEmployee extends Employee implements Department {
    // instance variable 
    String departmentName;
    static final int PER_DAY_HOUR = 8;
    double salary;
    // constructor 
    FullTimeEmployee(int employeeId, String name, double baseSalary, String departmentName) {
        // call super constructor 
        super(employeeId, name, baseSalary);
        // call method to assign department 
        assignDepartment(departmentName);
    }
    // method to assign department 
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;

    }
    // method to calculate salary 
    void calculateSalary() {
        salary = getBaseSalary() * PER_DAY_HOUR;

    }
    // display details 
    void displayDetails() {
        calculateSalary();
        super.displayDetails();

        System.out.println("Per Day Hours:" + PER_DAY_HOUR);
        System.out.println("Department :" + departmentName);
        System.out.println("total Salary:" + salary);

    }
    // department name 
    public void getDepartmentDetails() {
        System.out.println("Department :" + departmentName);

    }

}

// extend Employee class and implement interface department 
class PartTimeEmployee extends Employee implements Department {
    String departmentName;
    static final int PER_DAY_HOUR = 4;
    double salary;

    PartTimeEmployee(int employeeId, String name, double baseSalary, String departmentName) {
        super(employeeId, name, baseSalary);
        assignDepartment(departmentName);
    }

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;

    }

    void calculateSalary() {
        salary = getBaseSalary() * PER_DAY_HOUR;

    }

    void displayDetails() {
        calculateSalary();
        super.displayDetails();

        System.out.println("Per Day Hours:" + PER_DAY_HOUR);
        System.out.println("Department :" + departmentName);
        System.out.println("total Salary:" + salary);

    }

    public void getDepartmentDetails() {
        System.out.println("Department :" + departmentName);

    }

}
// main class
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        // create object 1
        Employee emp1 = new FullTimeEmployee(101, "Rahul", 1000, "IT");
        // create object 2
        Employee emp2 = new PartTimeEmployee(102, "Amit", 800, "HR");
        // display details 
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();

    }

}
