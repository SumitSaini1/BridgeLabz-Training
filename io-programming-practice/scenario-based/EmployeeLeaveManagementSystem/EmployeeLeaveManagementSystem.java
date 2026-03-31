package EmployeeLeaveManagementSystem;

import java.util.Scanner;

public class EmployeeLeaveManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LeaveService service = new LeaveService();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n========= Employee Leave Management System =========");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Request Leave");
            System.out.println("4. Approve / Reject Leaves");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    Employee emp = new Employee(id, name);
                    service.addEmployee(emp);
                    System.out.println("Employee Added Successfully");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = sc.nextLine();

                    Employee foundEmp = service.searchEmployeById(searchId);
                    if (foundEmp != null) {
                        System.out.println(foundEmp);
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    String empId = sc.nextLine();

                    Employee employee = service.searchEmployeById(empId);
                    if (employee == null) {
                        System.out.println("Employee Not Found");
                        break;
                    }

                    System.out.print("Enter Leave ID: ");
                    String leaveId = sc.nextLine();

                    System.out.print("Enter Leave Name: ");
                    String leaveName = sc.nextLine();

                    System.out.print("Enter Start Date: ");
                    String startDate = sc.nextLine();

                    System.out.print("Enter End Date: ");
                    String endDate = sc.nextLine();

                    LeaveRequest leave = new LeaveRequest(
                            leaveId, leaveName, startDate, endDate, employee);

                    try {
                        service.requestLeave(leave);
                        System.out.println("✅ Leave Requested Successfully");
                    } catch (InsufficientLeaveBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        service.approvedRejectLeaves();
                        System.out.println("Leave ticket successfully resolved ");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println(" Exiting System. Thank You!");
                    break;

                default:
                    System.out.println(" Invalid Choice. Try Again.");
            }
        }
        sc.close();
    }
}
