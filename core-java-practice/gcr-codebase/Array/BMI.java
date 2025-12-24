import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of persons: ");
        int numberOfPerson = input.nextInt(); // take input number of person 

        // Create a Arrays for weight, height, bmi, weightStatus 
        double[] weight = new double[numberOfPerson];
        double[] height = new double[numberOfPerson];
        double[] bmi = new double[numberOfPerson];
        String[] weightStatus = new String[numberOfPerson];

        for (int i = 0; i < numberOfPerson; i++) { // for calculate [i][i]
            System.out.println("Enter a weight " + (i + 1) + " Person");
            weight[i] = input.nextDouble();
            System.out.println("Enter a height " + (i + 1) + " Person in cm ");
            double heightInCm = input.nextDouble();
            double heightInMeter = heightInCm / 100; // convert cm to meter in height
            height[i] = heightInMeter;
            bmi[i] = weight[i] / (height[i] * height[i]);

            // condition for weught status 
            if (bmi[i] <= 18.4) {
                weightStatus[i]="Underweight";

            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i]="Normal";

            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i]="OverWeight";

            } else {
                weightStatus[i]="Obese";

            }

            System.out.println();

        }
        System.out.println("----------------------------------OUTPUT--------------------------------------");
        for (int i = 0; i < numberOfPerson; i++) {
            
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + weight[i] +
                    " | Height: " + height[i] + " inch " + 
                    " | BMI: " + bmi[i] +
                    " | Status: " + weightStatus[i]);
            System.out.println("-------------------------------------------------------------------------");
        }
        


    }

}
