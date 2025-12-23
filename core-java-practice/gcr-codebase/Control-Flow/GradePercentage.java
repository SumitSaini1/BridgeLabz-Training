import java.util.*;

public class GradePercentage {
    public static void CalculateGradePercentage(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Physics marks : ");
        int physics=input.nextInt();
        System.out.println("Enter chemistry marks : ");
        int chemistry=input.nextInt();
        System.out.println("Enter maths marks : ");
        int maths=input.nextInt();

        char grade;

        int totalSum=300; // total maximum sum of all subjects 
        int obtainSum=physics + chemistry + maths;  // find toatl obtain marks 
        float percentage= ((float) obtainSum /totalSum) * 100; // formula to find percentage

        if(percentage >=80){ // for Grade A
            grade='A';
            String remarks="(Level 4, above agency-normalized standards)";

            System.out.println("Grade: " + grade + ", Remarks: "+ remarks + ", Percentage: " + percentage +"%");

        }else if(percentage >=70 && percentage <= 79){  // for Grade B
            grade='B';
            String remarks="(Level 3, at agency-normalized standards)";

            System.out.println("Grade: " + grade + ", Remarks: "+ remarks + ", Percentage: " + percentage +"%");

        }else if(percentage >=60 && percentage <= 69){   // for Grade C
            grade='C';
            String remarks="(Level 2, below, but approaching agency-normalized standards)";

            System.out.println("Grade: " + grade + ", Remarks: "+ remarks + ", Percentage: " + percentage +"%");

        }
        else if(percentage >=50 && percentage <= 59){ //  for Grade D
            grade='D';
            String remarks="(Level 1, well below agency-normalized standards)";

            System.out.println("Grade: " + grade + ", Remarks: "+ remarks + ", Percentage: " + percentage +"%");

        }else if(percentage >=40 && percentage <= 49){  // for Grade E
            grade='E';
            String remarks="(Level 1- , too below agency-normalized standards)";

            System.out.println("Grade: " + grade + ", Remarks: "+ remarks + ", Percentage: " + percentage +"%");

        }else {  // for Grade f
            grade='R';
            String remarks="(Remedial standards)";

            System.out.println("Grade: " + grade + ", Remarks: "+ remarks + ", Percentage: " + percentage +"%");

        }
        
        

        
        

    }
    public static void main(String[] args) {
        GradePercentage.CalculateGradePercentage();
    }
    
}

