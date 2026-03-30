import java.util.Scanner;

public class StudentGrade2DArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

         
        int[][] marks = new int[n][3]; // [Physics, Chemistry, Maths] 2D Arrays 
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

        
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) { // check neagative values 
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // decrement index
                continue;
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            
            if (percentage[i] >= 80) { // calculate the Grade baes in certain condition
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        
        System.out.println("\n------ STUDENT RESULTS ------");
        for (int i = 0; i < n; i++) {  // display the results 
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + marks[i][0] +
                " | Chemistry: " + marks[i][1] +
                " | Maths: " + marks[i][2] +
                " | Percentage: " + percentage[i] +
                "% | Grade: " + grade[i]
            );
        }

        input.close();
    }
}
