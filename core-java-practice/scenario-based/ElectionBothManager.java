import java.util.Scanner;

public class ElectionBothManager {

    public static void VoteManager() {
        Scanner input = new Scanner(System.in);

        int voteCount = 0;

        while (true) { // Loop is breal when 
            System.out.println("Enter your age : ");
            int age = input.nextInt();

            if (age == 101) {
                break;
            }
            if (age >= 18) { // check for eligibility
                
                voteCount++;
                System.out.println("Vote Counted");
            } else {
                System.out.println("You are not Eligible");
            }

        }
        System.out.println("Total Votes :" + voteCount);

    }

    public static void main(String[] args) {
        ElectionBothManager.VoteManager();

    }

}
