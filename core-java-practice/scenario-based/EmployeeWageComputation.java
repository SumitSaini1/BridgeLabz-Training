import java.util.*;

public class EmployeeWageComputation {
    // Case 1: check employee attendance
    public static int attendanceCheck() {
        int attendance = (int) (Math.random() * 2);
        return attendance;
    }

    //  Case2: calculate daily wage
    public static void calculateDailyWage(Scanner input) {

        if (attendanceCheck() == 1) {
            System.out.println("-----------------Case 2 ---------------------------------");
            System.out.println("Employee is Present ");
            int wagePerhour = 20;
            int dailyEmployeeWage = 1;
            System.out.println("Full day/half day");
            String day = input.nextLine().toLowerCase();
            if (day.equals("full day")) {
                dailyEmployeeWage = wagePerhour * 8;
                System.out.println("Employee wage " + dailyEmployeeWage);

            } else if (day.equals("half day")) {
                dailyEmployeeWage = wagePerhour * 4;
                System.out.println("Employee wage " + dailyEmployeeWage);

            } else {
                System.out.println("Invalid Input");
            }

        } else {
            System.out.println("Employee is absent");
        }
        System.out.println();

    }

    // Case3: calculate wage based on employee type
    public static void wageBasedOnEmployeeType(Scanner input) {
        System.out.println("-------------------------------------Case 3 ---------------------------------------");
        int partTimeHourWage = 15;
        System.out.println("Enter your type (Full_time / Part_time)");
        String employeeType = input.nextLine().toLowerCase();

        if (employeeType.equals("part_time")) {
            int partTimeEmployeeWage = partTimeHourWage * 8; // assume part time employee work 8 hours a day
            System.out.println("Total Wage on Employee Type: " + partTimeEmployeeWage);

        } else if (employeeType.equals("full_time")) {
            int partTimeEmployeeWage = partTimeHourWage * 10; // assume part time employee works 10 hours
            System.out.println("Total Wage on Employee Type: " + partTimeEmployeeWage);

        } else {
            System.out.println("Invalid ");
        }
        System.out.println();

    }

    // Case 4: Calculate wage using switch case
    public static void calculateWageUsingSwitch(Scanner input) {

        System.out.println("---------------- Case 4 ----------------");
    
        int WAGE_PER_HOUR = 20;
    
        System.out.println("Enter your type (Full_time / Part_Time)");
        String employeeType = input.nextLine().toLowerCase();
        int workingHours;
    
        switch (employeeType) {
    
            case "full_time":
                System.out.println("Employee is Full Time");
                workingHours = 8;
                break;
    
            case "part_time":
                System.out.println("Employee is Part Time");
                workingHours = 4;
                break;
    
            default:
                System.out.println("Employee is Absent");
                workingHours = 0;
        }
    
        int dailyWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Daily Employee Wage: " + dailyWage);
        System.out.println();
    }
    
    // Case5: calculate monthly wage
    public static void calculateMonthlyWage() {
        System.out.println("----------------Case 5 -------------------");
        int hourlyWage = 20;
        int numberOfDaysPerDay = 10;
        int numberOfDayMonth = 20;

        int monthlywage = hourlyWage * numberOfDaysPerDay * numberOfDayMonth;
        System.out.println("Employee Monthly Wage : " + monthlywage);
        System.out.println();
    }
    // Case6: Calculate wages until max working days or hours limit is reached
    public static void calculateWageTillLimit() {
        System.out.println("----------------Case 6 -------------------");

        int monthDay = 20;
        int totalhour = 0;
        int totaldays = 0;
        int totalMonthlyWage = 0;
        while (true) {
            if (totalhour < 100 && totaldays < 20) {
                int hourPerDay = 8;
                int hourlyWage = 20;
                int wage = hourPerDay * hourlyWage;
                totalMonthlyWage = totalMonthlyWage + wage;
                totalhour += hourPerDay;
                totaldays++;

            } else {
                break;
            }

        }
        System.out.println("Total Working Days: " + totaldays);
        System.out.println("Total Working Hours: " + totalhour);
        System.out.println("Monthly Wage: " + totalMonthlyWage);

    }

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Case 2: Check attendance and calculate daily wage (full day / half day)
        calculateDailyWage(input);

        // Case 3: Calculate wage based on employee type (full-time / part-time)
        wageBasedOnEmployeeType(input);
        //Case 5: 
        calculateMonthlyWage();
        
        // Case 4: Calculate daily wage using switch-case and random employee type
        calculateWageUsingSwitch(input);

        // Case 6: Calculate wages until max working days or hours limit is reached
        calculateWageTillLimit();
        input.close();

    }

}
