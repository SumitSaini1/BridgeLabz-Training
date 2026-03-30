
class Employee{
    String name; 
    final int id; 
    String designation;
    static String companyName="Capgemini";
    static int totalEmployee=0;


    Employee(String name,int id, String designation ){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployee++;
        
    }

    void displayEmployeeDetails(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Name:"+name+"\nId:"+id+"\nDesignation:"+designation+"\nCompanyName:"+companyName);

    }

    static void displayTotalEmployee(){
        System.out.println("Total Employee:"+ totalEmployee);


    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Employee e=new Employee("Aditya", 12, "Frontend Developer");
        Employee e1 = new Employee("Thamarai", 101, "Software Engineer");

         // Display total employees
         Employee.displayTotalEmployee();
         System.out.println();

         // instanceof check before displaying details
         if (e instanceof Employee) {
             e.displayEmployeeDetails();
         }
 
         System.out.println();
 
         if (e1 instanceof Employee) {
             e1.displayEmployeeDetails();
         }

        
    }
    
}
