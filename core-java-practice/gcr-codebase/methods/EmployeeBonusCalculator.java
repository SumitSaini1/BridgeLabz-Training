public class EmployeeBonusCalculator {

    // method to generate old salary and years of service
    
    public static int[][] generateEmployeeData() {

        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {

            // generate 5 digit salary 
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // generate years of service
            data[i][1] = (int) (Math.random() * 10) + 1;
        }

        return data;
    }

    // method to calculate new salary and bonus
    
    public static int[][] calculateBonus(int[][] employeeData) {

        int[][] salaryDetails = new int[10][3];

        for (int i = 0; i < 10; i++) {

            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            int bonus;

            // if years of service is more than 5, bonus is 5%
            if (years > 5) {
                bonus = (oldSalary * 5) / 100;
            } else {
                // otherwise bonus is 2%
                bonus = (oldSalary * 2) / 100;
            }

            int newSalary = oldSalary + bonus;

            salaryDetails[i][0] = oldSalary;
            salaryDetails[i][1] = bonus;
            salaryDetails[i][2] = newSalary;
        }

        return salaryDetails;
    }

    // method to calculate and display total values
    public static void displayReport(int[][] employeeData, int[][] salaryDetails) {

        int totalOldSalary = 0;
        int totalBonus = 0;
        int totalNewSalary = 0;

        System.out.println("emp\told salary\tyears\tbonus\tnew salary");

        for (int i = 0; i < 10; i++) {

            totalOldSalary += salaryDetails[i][0];
            totalBonus += salaryDetails[i][1];
            totalNewSalary += salaryDetails[i][2];

            System.out.println(
                    (i + 1) + "\t" +
                    salaryDetails[i][0] + "\t\t" +
                    employeeData[i][1] + "\t" +
                    salaryDetails[i][1] + "\t" +
                    salaryDetails[i][2]
            );
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("total old salary : " + totalOldSalary);
        System.out.println("total bonus      : " + totalBonus);
        System.out.println("total new salary : " + totalNewSalary);
    }

    public static void main(String[] args) {

        // generate salary and service data
        int[][] employeeData = generateEmployeeData();

        // calculate bonus and new salary
        int[][] salaryDetails = calculateBonus(employeeData);

        // display final report
        displayReport(employeeData, salaryDetails);
    }
}