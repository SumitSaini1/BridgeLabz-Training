import java.util.*;

public class EmployeeWageComputation {

    // Case 1: check employee attendance
    public static int attendanceCheck() {
        // if 1 return means Employee is present;
        // if 2 return means Employee is absent;
        int attendance = (int) (Math.random() * 2);
        return attendance;
    }

    // Case2: calculate daily wage
    public static void calculateDailyWage(Scanner input) {
        // calculate wage when Employee is present
        if (attendanceCheck() == 1) {
            System.out.println("-----------------Case 2 ---------------------------------");
            System.out.println("Employee is Present ");
            // constant per hour wage
            int wagePerhour = 20;
            // variable to calculate
            int dailyEmployeeWage = 1;
            int emphours = 0;

            System.out.println("Full_day/half_day");
            String day = input.nextLine().toLowerCase();

            // Condition to check For Full_day/half_day
            if (day.equals("full_day")) {
                emphours = 8;

            } else if (day.equals("half_day")) {
                emphours = 4;

            } else {
                System.out.println("Invalid Input");
            }
            // calculate wage
            dailyEmployeeWage = wagePerhour * emphours;
            System.out.println("Employee wage " + dailyEmployeeWage);

        } else {
            System.out.println("Employee is absent");
        }
        System.out.println();

    }

    // Case3: calculate wage based on employee type
    public static void wageBasedOnEmployeeType(Scanner input) {
        System.out.println("-------------------------------------Case 3 ---------------------------------------");
        // variable
        int empRatePerHour = 0;
        int emphours = 0;
        int employeeWage = 0;

        // take Employee Type
        System.out.println("Enter your type (Full_time / Part_time)");
        String employeeType = input.nextLine().toLowerCase();

        // condition to check // for part_time
        if (employeeType.equals("part_time")) {
            emphours = 8;// assume part time employee work 8 hours a day
            empRatePerHour = 20;

            // For
        } else if (employeeType.equals("full_time")) {
            emphours = 10; // assume part time employee works 10 hours
            empRatePerHour = 20;

            // for full_time
        } else {
            System.out.println("Invalid ");
        }
        // calculate wage
        employeeWage = empRatePerHour * emphours;

        System.out.println("Total Wage on Employee Type: " + employeeWage);
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
        // Assume variables to calculate monthly wage
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

        // constant
        final int IS_Absent = 0;
        final int IS_FullTime = 1;
        final int IS_PartTime = 2;

        // varible defines
        int hourPerDay = 0;
        int hourlyWage = 0;

        // cariables to calculated
        int totalHour = 0;
        int totalDays = 0;
        int totalMonthlyWage = 0;

        // condition to check
        while (totalHour < 100 && totalDays < 20) {
            // generate numbers 0,1,2
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FullTime:
                    hourPerDay = 8;
                    hourlyWage = 20;
                    break;
                case IS_PartTime:
                    hourPerDay = 4;
                    hourlyWage = 20;
                    break;
                case IS_Absent:
                    hourPerDay = 0;
                    break;

            }

            int wage = hourPerDay * hourlyWage;
            totalMonthlyWage = totalMonthlyWage + wage;
            totalHour += hourPerDay;
            totalDays++;

        }
        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHour);
        System.out.println("Monthly Wage: " + totalMonthlyWage);

    }

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Case 2: Check attendance and calculate daily wage (full day / half day)
        calculateDailyWage(input);

        // Case 3: Calculate wage based on employee type (full-time / part-time)
        wageBasedOnEmployeeType(input);

        // Case 4: Calculate daily wage using switch-case and random employee type
        calculateWageUsingSwitch(input);

        // Case 5:
        calculateMonthlyWage();

        // Case 6: Calculate wages until max working days or hours limit is reached
        calculateWageTillLimit();
        input.close();

    }

}
