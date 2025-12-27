import java.util.Scanner;

public class StrudentVoteEligibility {

    // method to take a input age 
    public static int[] inputAgeOfStudent(Scanner input, int numberOfStudent) {
        int age[] = new int[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("Enter a "+ (i+1)+ " Students age:");
            age[i] = input.nextInt();
        }
        return age;

    }

    // method to check the eligibility of students 
    public static String[][] checkvoteEligibility(int[] age) {
        // array to store ang and eligibility status 
        String[][] voteAge = new String[age.length][2];

        // check eligibility 
        for (int i = 0; i < age.length; i++) {
            // If age is negative or zero 
            if (age[i] <= 0) {
                voteAge[i][0] = String.valueOf(age[i]);
                voteAge[i][1] = "Negative age can not vote";

            } else if (age[i] >= 18) { // if age is above and equal 18
                voteAge[i][0] = String.valueOf(age[i]);
                voteAge[i][1] = "True";

            } else { // Condition for age is less than 18
                voteAge[i][0] = String.valueOf(age[i]);
                voteAge[i][1] = "False";

            }

        }
        return voteAge;

    }

    public static void displayResult(String[][] voteAge) {
        System.out.println("--------Output---------------------------------------");
        System.out.println("--------Eligibility Of Students for vote-------------");
        for(int i=0;i<voteAge.length;i++){
            System.out.println(voteAge[i][0] + "\t" + voteAge[i][1]);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudent = 10;

        // call method to find users input array stored age of students
        int[] age = inputAgeOfStudent(input, numberOfStudent);

        String[][] voteAge = checkvoteEligibility(age);

        displayResult(voteAge);

    }

}
