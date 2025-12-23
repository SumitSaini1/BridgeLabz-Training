import java.util.Scanner;

public class LogicalLeapYear{
    public static void CheckLeapYear(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year number :");
        int year=input.nextInt();

       

        // Using   condition
        if(year<1582){
            System.out.println("Leap year calculation is valid only above 1582 ");
        }
        else if((year % 4==0 && year % 100 !=0) || year % 400==0 ){ // condittion for checking leap year 
            System.out.println("Year " + year +" is a leap year"); 
        }else{
            System.out.println("Year " + year +" is not a leap year");
        }
    }
    public static void main(String[] args) {
        LogicalLeapYear.CheckLeapYear();
    }
}