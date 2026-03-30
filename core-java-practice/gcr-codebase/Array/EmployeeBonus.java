import java.util.Scanner;

public class EmployeeBonus {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double[] oldSalary=new double[10] ; // store users input old salary 
        int[] years=new int[10]; //  store users input year
        double[] newSalary=new double[10]; // store new salary after calculation bonus + oldSalary
        double[] bonus=new double[10]; // store bonus 

        for(int i=0;i<10;i++){ // taking input from user salry and years 
            System.out.println("Enter your " + (i+1) +  " Employee Salary :");
            double Salary=input.nextInt();

            if(Salary < 1){
                System.out.println("Invalid Salary, " + (i+1) + " So Enter Again :");
                Salary=input.nextInt();
            
                
            }
            oldSalary[i]=Salary;
            
            System.out.println("Enter years "+ (i+1) + " Person of service :");

            int yearService=input.nextInt();
            if(yearService < 1){
                System.out.println(" Enter valid " + (i+1) + "person Year again :");
                yearService=input.nextInt();

            }
            years[i]=yearService;


        }

        for(int i=0;i<10;i++){ // Loop for count the bonus and new salery 

            double employeeBonus=0;
            if(years[i] >= 5 ){ // To find the bonus greater than 5 years of service 
                employeeBonus=(oldSalary[i] * 5) / 100; // Formula to find bonus 
                bonus[i]=employeeBonus;
                newSalary[i]= oldSalary[i] + bonus[i];


            }else{ // To find the bonus less than 5 years of service 
                employeeBonus=(oldSalary[i] * 2) / 100;
                bonus[i]=employeeBonus;
                newSalary[i]= oldSalary[i] + bonus[i];

            }
            
            
        }
        for(int i=0;i<10;i++){ // print the result 
            System.out.println(" total_Bonus: "+ bonus[i] + ", New_salary: " + newSalary[i] + ", Old_Salary: " + oldSalary[i] );
        }



    }
    
    
}
