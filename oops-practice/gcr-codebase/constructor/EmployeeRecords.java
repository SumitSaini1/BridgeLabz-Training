// parent class
class Employee {

    // variable                                                                           
    public int employeeID;                                                               
    protected String department;                                                 
    private double salary;                               
    
    // constructor                                                 
    Employee(int employeeID, String department, double salary) {              
        this.employeeID = employeeID;        
        this.department = department;        
        this.salary = salary;                                      
    }

    // setter
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // getter
    public double getSalary() {
        return salary;
    }
}


class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        // call parent constructor
        super(employeeID, department, salary);
    }


    void displayManagerInfo() {
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);    
        
    }
}


public class EmployeeRecords {

    public static void main(String[] args) { 

        Manager manager =
                new Manager(101, "IT", 75000);

        manager.displayManagerInfo();

        manager.setSalary(80000); 
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
