    import java.util.Scanner;

    public class Vote {
        public static boolean canStudentVote(int age){
            if (age <= 0) {
                return false;   // invalid age
            }
    
            if (age >= 18) {
                return true;    // can vote
            }
    
            return false;       // cannot vote

            

        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        int[] ages = new int[10]; // exactly 10 students

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        System.out.println("\n--- Voting Result ---");

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            boolean result = canStudentVote(ages[i]);

            if (ages[i] <= 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age");
            } else if (result) {
                System.out.println("Student " + (i + 1) + ": Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + ": Cannot Vote");
            }
        }

        input.close();
            
        }
        
    }
