import java.util.*;

public class BmiUsingMultidimensional {

    // method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100; // cm → meter

            data[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    // method to determine bmi status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int persons = 10;
        double[][] personData = new double[persons][3];

        // input weight and height
        for (int i = 0; i < persons; i++) {
            System.out.println("\nPerson " + (i + 1));

            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (cm): ");
                personData[i][1] = input.nextDouble();
            } while (personData[i][1] <= 0);
        }

        // call method
        calculateBMI(personData);
        String[] status = getBMIStatus(personData);

        // display report
        System.out.println("\n=========== BMI REPORT ===========");
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " cm");
            System.out.printf("BMI    : %.2f\n", personData[i][2]);
            System.out.println("Status : " + status[i]);
            System.out.println("---------------------------------");
        }

        input.close();
    }
}
