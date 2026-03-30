import java.util.Scanner;

public class StudentMarksCalculator {

    // method to generate random pcm marks for all students

  
    public static int[][] generatePCMMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {

            // generate random 2 digit marks (10 to 99)
            marks[i][0] = (int) (Math.random() * 90) + 10;
            marks[i][1] = (int) (Math.random() * 90) + 10;
            marks[i][2] = (int) (Math.random() * 90) + 10;
        }

        return marks;
    }

    // method to calculate total average and percentage
 
    public static double[][] calculateResults(int[][] marks) {

        int students = marks.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;

            // percentage out of 300
            double percentage = (total / 300.0) * 100;

            // round values to 2 digits
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static String getGrade(double percentage) {

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    // method to display scorecard in tabular format
    public static void displayScoreCard(int[][] marks, double[][] results) {

        System.out.println("stu\tphy\tchem\tmath\ttotal\tavg\t%\tgrade");

        for (int i = 0; i < marks.length; i++) {

            String grade = getGrade(results[i][2]);

            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grade
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input for number of students
        System.out.print("enter number of students: ");
        int students = input.nextInt();

        // generate marks
        int[][] marks = generatePCMMarks(students);

        // calculate results
        double[][] results = calculateResults(marks);

        // display final scorecard
        displayScoreCard(marks, results);
    }
}
