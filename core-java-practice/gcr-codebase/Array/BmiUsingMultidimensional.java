import java.util.*;

public class BmiUsingMultidimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D array: [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input positive only
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive!");
                }
            } while (personData[i][0] <= 0);

            // Height input positive only
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println(" Height must be positive!");
                }
            } while (personData[i][1] <= 0);

            // BMI calculation
            personData[i][2] = personData[i][0] /
                               (personData[i][1] * personData[i][1]);

            // BMI status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n========= BMI REPORT =========");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " m");
            System.out.printf("BMI    : %.2f\n", personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
            System.out.println("-------------------------------");
        }

        input.close();
    }

}
