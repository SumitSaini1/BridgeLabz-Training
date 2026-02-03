package StreamBuzz;

import java.util.HashMap;
import java.util.Scanner;

public class StreamBuzzUserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program program = new Program();
        HashMap<String, Integer> lastResult = new HashMap<>();

        while (true) {

            System.out.println("\n===== STREAM BUZZ MENU =====");
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter Creator Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number of weeks: ");
                    int weeks = sc.nextInt();

                    double[] likes = new double[weeks];
                    for (int i = 0; i < weeks; i++) {
                        System.out.print("Enter likes for week " + (i + 1) + ": ");
                        likes[i] = sc.nextDouble();
                    }

                    CreatorStats creator = new CreatorStats(name, likes);
                    program.RegisterCreator(creator);
                    break;

                case 2:
                    System.out.print("Enter like threshold: ");
                    double threshold = sc.nextDouble();

                    
                    HashMap<String, Integer> temp = program.getTopPostCount(threshold);

                    if (temp.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        lastResult = temp;
                        program.display(lastResult);
                    }
                    program.display(lastResult);
                    break;

                case 3:
                    double avg = program.CalculateAverageLikes();
                    System.out.println("Average Likes Count: " + avg);
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
