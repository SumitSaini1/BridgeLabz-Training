package EmployeeRolePolymorphism;

import java.util.Scanner;

public class EmployeeRolePolymorphism {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Employee Menu ======");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Manager Name: ");
                    String mName = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double mSalary = sc.nextDouble();
                    sc.nextLine();

                    Employee manager = new Manager(mName, mSalary, "Manager");
                    manager.getBonus();
                    manager.display();
                    break;

                case 2:
                    System.out.print("Enter Developer Name: ");
                    String dName = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double dSalary = sc.nextDouble();
                    sc.nextLine();

                    Employee developer = new Developer(dName, dSalary, "Developer");
                    developer.getBonus();
                    developer.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();

	}

}
