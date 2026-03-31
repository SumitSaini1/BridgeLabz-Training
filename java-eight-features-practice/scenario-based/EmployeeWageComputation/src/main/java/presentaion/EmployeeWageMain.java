package presentaion;

import model.CompanyEmpWage;
import dao.EmpWageBuilder;
import dao.IEmpWageBuilder;
public class EmployeeWageMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder empWageBuilder = new EmpWageBuilder();

        // uc8 multipe companies
        empWageBuilder.addCompany("TCS", 20, 20, 100);
        empWageBuilder.addCompany("Infosys", 25, 22, 110);
        empWageBuilder.addCompany("Wipro", 30, 18, 90);

        empWageBuilder.computeWage();

        System.out.println("Total Wage for Infosys: "
                + empWageBuilder.getTotalWage("Infosys"));
    }
}
