import java.util.Scanner;

public class Bmi {
    public static void CalculateBmi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in KG :");

        double weight =input.nextDouble();
        System.out.println("Enter your height in cm :");

        double heightInCm=input.nextDouble(); // take height in centimeters
        double heightInMeter= heightInCm / 100; // convert Cm to Meter 

        double BMI= weight / (heightInMeter * heightInMeter); // Calculate formula for BMI 

        if(BMI <= 18.4){
            System.out.println("Person BMI " + BMI + ", Status: Underweight" );
        }else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Person BMI " + BMI + ", Status: Normal" );

        }else if(BMI >= 25.0 && BMI <= 39.9){
            System.out.println("Person BMI " + BMI + ", Status: OverWeight" );

        }else{
            System.out.println("Person BMI " + BMI + ", Status: obese" );

        }
        input.close();
        

    }
    public static void main(String[] args) {
        Bmi.CalculateBmi();
    }
   

}
