import java.util.Scanner;

public class LeapYearChecker {
    // method to find to check is leapyear or not 
    public static boolean isLeapYear(int year){
        if(year < 1582){
            return false;
        }else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;

        }else{
            return false;
        }
        

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Call the  method
        boolean result = isLeapYear(year);

        // Display output
        if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
    
}
