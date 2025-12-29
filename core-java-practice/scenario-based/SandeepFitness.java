import java.util.Scanner;

public class SandeepFitness {
    // take user input for each day pushups 
    public static int[] numberOfPushups() {

        Scanner input = new Scanner(System.in);
        // array to store 7 days pushups
        int[] pushups = new int[7];
        // inputs the number of pushups and add into the array 
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter a number of pushups on day " + (i + 1));
            pushups[i] = input.nextInt();

        }
        return pushups;

    }

    // method to calculate the average and total pushups in a week 
    public static int[] totalAverage(int[] pushups) {

        int totalPushupsCounts = 0;
        int activeDays = 0;
        for (int day : pushups) {
            if (day == 0) {
                continue;
            }
            totalPushupsCounts += day;
            activeDays++;
        }
        // find average
        int average = totalPushupsCounts / activeDays;
        // return array 
        return new int[]{totalPushupsCounts,activeDays,average};

       
    }
    // Display Records
    public static void displayTrackRecord(int[] records){
        System.out.println("===========Sandeep Fitness Tracker===============");
        System.out.println("-----------------------------------------------------");
        System.out.println("TotalPushupsCount \t" + records[0]);
        System.out.println("Total Active day  \t " + records[1]);
        System.out.println("average  \t \t" + records[2]);
    }

    public static void main(String[] args) {

        int[] pushups = numberOfPushups();
        // call method to calculate avaearege total etc.
        int[] records=totalAverage(pushups);
        // display result 
        displayTrackRecord(records);

    }

}
