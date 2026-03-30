import java.util.*;

public class LeapYear {
    public static void CheckLeapYear(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year number :");
        int year=input.nextInt();

        // first part having multiple if-else
        if(year<1582){
            System.out.println("Leap year calculation is valid only above 1582 ");
        }else{
            if(year % 400==0){
                System.out.println("Year " + year +" is a leap year");
            }else if(year % 100 ==0){
                System.out.println("Year" + year + " is not a leap year");
            }else if(year % 4==0){
                System.out.println("Year " + year +" is a leap year");

            }else{
                System.out.println("Year" + year + " is not a leap year");
            }
        }

        // 2nd part having one if many condition
        if(year<1582){
            System.out.println("Leap year calculation is valid only above 1582 ");
        }
        else if((year % 4==0 && year % 100 !=0) || year % 400==0 ){
            System.out.println("Year " + year +" is a leap year");
        }else{
            System.out.println("Year " + year +" is not a leap year");
        }

    }
    public static void main(String[] args) {
        LeapYear.CheckLeapYear();
    }
    
}
