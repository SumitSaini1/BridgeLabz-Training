package OnlineClassroomAttendanceTracker;

import java.util.Scanner;

public class OnlineClassroomAttendanceTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AttendanceTracker tracker = new AttendanceTracker();

        while (true) {
            System.out.println("\n===== Online Classroom Attendance Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Session Attendance");
            System.out.println("3. Display Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentId = sc.nextLine();
                    System.out.println("Enter Student Name");
                    String name=sc.nextLine();
                    tracker.addId(new Student(studentId,name));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Session ID: ");
                    String sessionId = sc.nextLine();
                    System.out.print("Enter Session Name: ");
                    String sessionName = sc.nextLine();
                    Session session = new Session(sessionId,sessionName);

                    try {
                        tracker.addSessionAttendance(session);
                        System.out.println("Attendance marked successfully!");
                    } catch (DuplicateAttendanceException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;

                case 3:
                    tracker.display();
                    break;

                case 4:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
		// TODO Auto-generated method stub

	}

}
