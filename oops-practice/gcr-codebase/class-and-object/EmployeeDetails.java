

public class EmployeeDetails {
    // instance variables 
    String empName;
    int id;
    int empSalary;
    // method to display employee details
    void display(){
        System.out.println("Empployee Name"+ empName);
        System.out.println("Id"+ id);
        System.out.println("Employee Salary" + empSalary);
    }
    public static void main(String[] args) {
        // creating an object of Employee class
        EmployeeDetails obj=new EmployeeDetails();
        obj.empName="Rohan";
        obj.id=1;
        obj.empSalary=50000;
        // calling method to display details
        obj.display();
    }
    
}
