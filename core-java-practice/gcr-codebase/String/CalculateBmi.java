import java.util.Scanner;

public class CalculateBmi {

    // Function to take height and weight from user and store in twoD Array 
    public static double[][] inputWeightHeight(Scanner input, int numberOfStudents) {
        // Make a 2D Array to store height and weight 
        double[][] weightHeight = new double[numberOfStudents][2];

        // loop for input number of students 
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter your weight in Kg:");
            weightHeight[i][0] = input.nextDouble();
            System.out.println("Enter your Height in cm");
            // Convert height cm to inch 
            double heightInCm = input.nextDouble();
            weightHeight[i][1] = heightInCm / 100;
        }

        return weightHeight;

    }
    // method to calculateBmi and status based on weight and height 
    public static String[][] calculateBmiAndStatus(int numberOfStudents,double[][] weightHeight) {
        
        // make 2D Array to store a BMI and Status
        String[][] bmiAndStatus = new String[numberOfStudents][2];

        // loop to find Bmi and status based on certain condition 
        for (int i = 0; i < numberOfStudents; i++) {
            double weight=weightHeight[i][0];
            double height=weightHeight[i][1];
            double BMI = weight / (height * height); // Calculate formula for BMI

            // Condition for Status based on Bmi above calculate 
            if (BMI <= 18.4) {
                bmiAndStatus[i][0]=String.valueOf(BMI);
                bmiAndStatus[i][1]="Underweight";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                
                bmiAndStatus[i][0]=String.valueOf(BMI);
                bmiAndStatus[i][1]="Normal";

            } else if (BMI >= 25.0 && BMI <= 39.9) {
                bmiAndStatus[i][0]=String.valueOf(BMI);
                bmiAndStatus[i][1]="OverWeight";
                

            } else {
                bmiAndStatus[i][0]=String.valueOf(BMI);
                bmiAndStatus[i][1]="obese";
                

            }

        }
        return bmiAndStatus;

        

    }
    // Method to merge all above height weight bmi and Status on a Single 2D array 
    public static String[][] bmiRecord(double[][] weightHeight,int numberOfStudents){
        // call a method to calculate BMI and Status 
        String[][] bmiAndStatus=calculateBmiAndStatus(numberOfStudents,weightHeight);
        // Store all record in one  2D array
        String[][] bmicalculateRecord=new String[numberOfStudents][4];

        // loop to put all field in one array 
        for(int i=0;i<numberOfStudents;i++){
            bmicalculateRecord[i][0]=String.valueOf(weightHeight[i][0]);
            bmicalculateRecord[i][1]=String.valueOf(weightHeight[i][1]);

            bmicalculateRecord[i][2]=bmiAndStatus[i][0];
            bmicalculateRecord[i][3]=bmiAndStatus[i][1];


        }
        return bmicalculateRecord;

    }
    // Display all record 
    public static void displayRecord(String[][] bmicalculateRecord) {

        System.out.println("Weight\tHeight\tBMI\tStatus");
    
        for (int i = 0; i < bmicalculateRecord.length; i++) {
            System.out.println(
                bmicalculateRecord[i][0] + "\t" +
                bmicalculateRecord[i][1] + "\t" +
                bmicalculateRecord[i][2] + "\t" +
                bmicalculateRecord[i][3]
            );
        }
    }
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 3;
        // Call input method 
        double[][] weightHeight=inputWeightHeight(input, numberOfStudents);

        // call RecordCalculate 
        String[][] bmicalculateRecord=bmiRecord(weightHeight,numberOfStudents);

        // Display record
        displayRecord(bmicalculateRecord);

        
    }

}
