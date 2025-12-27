import java.util.*;

public class StudentReport {
    // Method to input the subjects Score 
    public static int[][] subjectScore(Scanner input,int numberOfStudents){
        // Two D Array for storing marks  
        int[][] subjectmarks=new int[numberOfStudents][3];

        for(int i=0;i<numberOfStudents;i++){
            System.out.println("Enter a Student "+ (i+1) + " physics marks: ");
            // Roundof the number if it in double or float 
            subjectmarks[i][0]=(int) Math.round(input.nextDouble());

            // Roundof the number if it in double or float 
            System.out.println("Enter a Student "+ (i+1) + " chemistry marks: ");
            subjectmarks[i][1]=(int) Math.round(input.nextDouble());

            System.out.println("Enter a Student "+ (i+1) + " Maths marks: ");
            subjectmarks[i][2]=(int) Math.round(input.nextDouble());
        }
        return subjectmarks;

    }

    // methods to calculate the totalMarksSum, Average, Percentage
    public static int[][] CalculateTotal(int[][] subjectmarks){
        // Store the  totalMarksSum, Average, Percentage
        int[][] totalMarks=new int[subjectmarks.length][3];
        for(int i=0;i<subjectmarks.length;i++){

            // Find sum of marks 
            int totalMarksSum=subjectmarks[i][0] + subjectmarks[i][1] + subjectmarks[i][2];

            // find Average of subject marks 
            int average=(int) Math.round(totalMarksSum/3.0);

            // find percentage of marks 
            int percentage = (int) Math.round((totalMarksSum / 300.0) * 100);

            totalMarks[i][0]=totalMarksSum;
            totalMarks[i][1]=average;
            totalMarks[i][2]=percentage;





        }

        return totalMarks ;


    } 

    public static String[][] calculateGrade(int[][] totalMarks){
        String[][] marksAndGrade=new String[totalMarks.length][4];
        for(int i=0;i<totalMarks.length;i++){
            marksAndGrade[i][0]=String.valueOf(totalMarks[i][0]);
            marksAndGrade[i][1]=String.valueOf(totalMarks[i][1]);
            marksAndGrade[i][2]=String.valueOf(totalMarks[i][2]);

            int percentage=totalMarks[i][2];


            // Find grade based on percentage 
            if(percentage >=80){ // for Grade A
                marksAndGrade[i][3]="A";
               
    
            }else if(percentage >=70 && percentage <= 79){  // for Grade B
                marksAndGrade[i][3]="B";
                
    
            }else if(percentage >=60 && percentage <= 69){   // for Grade C
                marksAndGrade[i][3]="C";
                
    
            }
            else if(percentage >=50 && percentage <= 59){ //  for Grade D
                marksAndGrade[i][3]="D";
               
    
            }else if(percentage >=40 && percentage <= 49){  // for Grade E
                marksAndGrade[i][3]="E";
                
    
            }else {  // for Grade Remedial 
                marksAndGrade[i][3]="R";
                
    
            }



        }
        return marksAndGrade;

    }

    // Display Result 
    public static void displayReportCard(int[][] subjectmarks, String[][] marksAndGrade) {

        System.out.println("\n======================== REPORT CARD ========================");
        System.out.printf("%-10s %-10s %-12s %-10s %-10s %-10s %-12s %-8s%n",
        "Student","Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");

        System.out.println("-------------------------------------------------------------");
    
        for (int i = 0; i < subjectmarks.length; i++) {
            System.out.printf("%-10s %-10d %-12d %-10d %-10s %-14s %-11s %-8s%n",
                    "Student " + (i + 1),
                    subjectmarks[i][0],
                    subjectmarks[i][1],
                    subjectmarks[i][2],
                    marksAndGrade[i][0],      // Total
                    marksAndGrade[i][1],      // Average
                    marksAndGrade[i][2] + "%",// Percentage
                    marksAndGrade[i][3]       // Grade
            );
        }
        
    
        System.out.println("=============================================================");
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int numberOfStudents=input.nextInt();

        int[][] subjectmarks=subjectScore(input, numberOfStudents);

        // calculate total, Average, Percentage 
        int[][] totalMarks=CalculateTotal(subjectmarks);

        // Calculate Grades based on percentage 
        String[][]  marksAndGrade =calculateGrade(totalMarks);

        // Call method to display result 
        displayReportCard(subjectmarks,marksAndGrade);



    }

    
}
