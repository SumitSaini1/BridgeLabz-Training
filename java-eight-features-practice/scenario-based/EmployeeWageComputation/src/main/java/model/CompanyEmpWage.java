package model;


import java.util.ArrayList;

public class CompanyEmpWage {

    public final String companyName;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;

    private int totalEmpWage;

    private ArrayList<Integer> dailyWages;   //uc 13

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }

    public void addDailyWage(int wage) {
        dailyWages.add(wage);
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public String toString() {
        return "Company: " + companyName +
               " | Total Wage: " + totalEmpWage;
    }
}
