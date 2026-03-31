package presentation;

import model.Patient;
import service.PatientService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientService();

        while (true) {

            System.out.println("\n====== Patient Management System ======");
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient by ID");
            System.out.println("3. Update Patient");
            System.out.println("4. Search Patients by Name");
            System.out.println("5. Display All Patients");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            Patient p;

            switch (choice) {

                case 1:
                    p = new Patient();

                    System.out.print("Enter Name: ");
                    p.setName(sc.nextLine());

                    System.out.print("Enter DOB (yyyy-mm-dd): ");
                    p.setDob(LocalDate.parse(sc.nextLine()));

                    System.out.print("Enter Phone: ");
                    p.setPhone(sc.nextLine());

                    System.out.print("Enter Email: ");
                    p.setEmail(sc.nextLine());

                    System.out.print("Enter Address: ");
                    p.setAddress(sc.nextLine());

                    System.out.print("Enter Blood Group: ");
                    p.setBloodGroup(sc.nextLine());

                    service.registerPatient(p);
                    System.out.println("Patient Registered Successfully");
                    break;

                case 2:
                    System.out.print("Enter Patient ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    p = service.searchById(id);
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 3:
                    p = new Patient();

                    System.out.print("Enter Patient ID to Update: ");
                    p.setId(Integer.parseInt(sc.nextLine()));

                    System.out.print("Enter New Name: ");
                    p.setName(sc.nextLine());

                    System.out.print("Enter New Phone: ");
                    p.setPhone(sc.nextLine());

                    System.out.print("Enter New Email: ");
                    p.setEmail(sc.nextLine());

                    System.out.print("Enter New Address: ");
                    p.setAddress(sc.nextLine());

                    System.out.print("Enter New Blood Group: ");
                    p.setBloodGroup(sc.nextLine());

                    service.updatePatient(p);
                    System.out.println("Patient Updated Successfully");
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();

                    ArrayList<Patient> patients = service.searchByName(name);
                    if ( patients==null || patients.isEmpty() ) {
                        System.out.println("No patients found.");
                    } else {
                        patients.forEach(System.out::println);
                    }
                    break;

                case 5:
                    ArrayList<Patient> allPatients = service.displayAllPatients();
                    if (allPatients==null || allPatients.isEmpty() ) {
                        System.out.println("No patients found.");
                    } else {
                        allPatients.forEach(System.out::println);
                    }
                    break;

                case 6:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);
                    

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
