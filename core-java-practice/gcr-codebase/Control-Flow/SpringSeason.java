import java.util.*;

public class SpringSeason {
    public static void CheckSpring(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month name : ");
        String month=input.nextLine();
        System.out.println("Enter date number :");
        int date=input.nextInt();
        
        if((date >= 20 && month.equalsIgnoreCase("March")) || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || (month.equalsIgnoreCase("June") && date<=20 )){
            System.out.println("Its a Spring Season");

        }else{
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
    public static void main(String[] args) {
        SpringSeason.CheckSpring();
    }
}
