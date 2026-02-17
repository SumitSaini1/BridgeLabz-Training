package dao;

import model.CompanyEmpWage;

import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    private ArrayList<CompanyEmpWage> companyList;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
    }

    // uc 8, uc10, uc 12
    @Override
    public void addCompany(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours) {

        CompanyEmpWage company =
                new CompanyEmpWage(companyName, wagePerHour,
                        maxWorkingDays, maxWorkingHours);

        companyList.add(company);
    }

    // uc 1 – attendance check
    private int checkAttendance() {
        return (int) (Math.random() * 3);
    }

    // uc 2, uc 3 uc 4,uc 5 uc 6
    private int computeCompanyWage(CompanyEmpWage company) {

        final int IS_ABSENT = 0;
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < company.maxWorkingHours &&
               totalDays < company.maxWorkingDays) {

            totalDays++;

            int empCheck = checkAttendance();   // uc 1
            

            int empHours = 0;

            // uc 4
            switch (empCheck) {

                case IS_FULL_TIME:
                    empHours = 8;   // uc 2
                    break;

                case IS_PART_TIME:
                    empHours = 4;   // uc 3
                    break;

                default:
                    empHours = 0;
            }

            totalHours += empHours;

            int dailyWage = empHours * company.wagePerHour;  // uc 2
            totalWage += dailyWage;

            company.addDailyWage(dailyWage);   // uc 13
        }

        return totalWage;
    }

    @Override
    public void computeWage() {

        for (CompanyEmpWage company : companyList) {

            int totalWage = computeCompanyWage(company);

            company.setTotalEmpWage(totalWage);

            System.out.println(company);
        }
    }

    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyList) {

            if (company.companyName.equals(companyName)) {
                return company.getTotalEmpWage();   // uc 14
            }
        }
        return 0;
    }
}
