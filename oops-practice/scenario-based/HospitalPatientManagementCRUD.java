
import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String gender;

    Patient(int patientId, String patientName, int age, String gender) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;

    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientAge() {
        return age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getGender() {
        return gender;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // display record polymorphism
    public void displayPatientRecord() {
        System.out.println("Patient Id:" + patientId);
        System.out.println("Patient Name:" + patientName);
        System.out.println("Patient Age:" + age);
        System.out.println("Patient Gender:" + gender);

    }

}

class InPatient extends Patient {
    private String checkInDate;
    private int roomNo;

    InPatient(int patientId, String patientName, int age, String gender, int roomNo, String checkInDate) {
        super(patientId, patientName, age, gender);
        this.roomNo = roomNo;
        this.checkInDate = checkInDate;

    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void displayPatientRecord() {
        super.displayPatientRecord();
        System.out.println("Check In date:" + checkInDate);
        System.out.println("Patient Room No:" + roomNo);

    }

}

class OutPatient extends Patient {

    private String checkOutDate;

    OutPatient(int patientId, String patientName, int age, String gender, String checkOutDate) {
        super(patientId, patientName, age, gender);

        this.checkOutDate = checkOutDate;

    }

    public void displayPatientRecord() {
        super.displayPatientRecord();

        System.out.println("Check Out date:" + checkOutDate);

    }

}

interface Ipayable {
    public void payableAmount();
}

class Bill implements Ipayable {
    private int billNo;
    private double bill;
    final static double GST = 5.0;
    private double totalBill;
    double gstAmount;

    private Patient patient;

    Bill(int billNo, double bill, Patient patient) {

        this.billNo = billNo;
        this.bill = bill;
        this.patient = patient;
    }

    public void payableAmount() {
        gstAmount = (bill * GST) / 100;
        totalBill = bill + gstAmount;

    }

    public double getTotalBill() {
        return totalBill;

    }

    public int getBillId() {
        return billNo;
    }

    public void setBillAmount(double bill) {
        this.bill = bill;
    }

    public void displayPatientBill() {
        System.out.println("====================Hostpital Bill ========================");
        System.out.println("Bill No.:" + billNo);
        System.out.println("------------------Patient Details-------------------------");
        patient.displayPatientRecord();
        System.out.println("------------------BILL DETAILS ----------------------------");
        System.out.println("Bill:" + bill);
        System.out.println("GST:" + GST + " %");
        System.out.println("GST Amount:" + gstAmount);

        System.out.println("TotalPayable Bill :" + totalBill);

    }

}

class Doctor {
    private int doctorId;
    private String doctorName;
    private String doctorGender;
    private String doctorQualification;
    private double doctorYearsOfExperience;

    Doctor(int doctorId, String doctorName, String doctorGender, String doctorQualification,
            double doctorYearsOfExperience) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorGender = doctorGender;
        this.doctorQualification = doctorQualification;
        this.doctorYearsOfExperience = doctorYearsOfExperience;

    }

    public String getDoctorName() {
        return doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    // Display Doctor Record
    public void displayDoctorRecord() {
        System.out.println("----- Doctor Details -----");
        System.out.println("Doctor ID           : " + doctorId);
        System.out.println("Doctor Name         : " + doctorName);
        System.out.println("Doctor Gender       : " + doctorGender);
        System.out.println("Qualification       : " + doctorQualification);
        System.out.println("Years of Experience : " + doctorYearsOfExperience);
        System.out.println("--------------------------");
    }

}

class Service {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Bill> bills = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    public Scanner input = new Scanner(System.in);

    // CRUD operation for Patient
    // add patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient Added");

    }

    // view records of patient
    public void displayPatientRcords() {
        if (patients.isEmpty()) {
            System.out.println("No Patient Found");
            return;
        }
        for (Patient p : patients) {
            System.out.println("====================Patient Records============================");
            p.displayPatientRecord();
            System.out.println("----------------------");

        }

    }

    // update patient name by id
    public void updatePatientNameById(int id, String patientName) {
        for (Patient p : patients) {
            if (p.getPatientId() == id) {
                p.setPatientName(patientName);
                System.out.println("Patient name updated successfully.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // delete patient By id
    public void deletePatientRecord(int id) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getPatientId() == id) {
                patients.remove(i);
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // CRUD operation for Bill

    // create bill
    public void addBill(Bill bill) {
        bills.add(bill);
    }

    // view Bills
    public void viewAllBills() {
        if (bills.isEmpty()) {
            System.out.println("No Bill Found");
            return;
        }
        for (Bill b : bills) {
            System.out.println("====================Bill Records============================");
            b.displayPatientBill();
            System.out.println("----------------------");

        }

    }

    // update bill
    public void updateBillAmount(int billNo, double newAmount) {
        for (Bill b : bills) {
            if (b.getBillId() == billNo) {
                b.setBillAmount(newAmount);
                b.payableAmount();
                System.out.println("Bill updated successfully.");
                return;
            }
        }
        System.out.println("Bill not found.");
    }

    // delete bill number
    public void deleteBillById(int billNo) {
        for (int i = 0; i < bills.size(); i++) {
            if (bills.get(i).getBillId() == billNo) {
                bills.remove(i);
                return;
            }
        }
        System.out.println("Bill not found.");
    }

    // CRUD for doctor
    // Create Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor Added");

    }

    // view records of doctors
    public void displayDoctorRcords() {
        if (doctors.isEmpty()) {
            System.out.println("No Doctor Found");
            return;
        }
        for (Doctor d : doctors) {
            System.out.println("====================Doctors Records============================");
            d.displayDoctorRecord();
            System.out.println("----------------------");

        }

    }

    // update doctors name by id
    public void updateDoctorNameById(int id, String doctorName) {
        for (Doctor p : doctors) {
            if (p.getDoctorId() == id) {
                p.setDoctorName(doctorName);
                System.out.println("Doctor name updated successfully.");
                return;
            }
        }
        System.out.println("Doctor not found.");
    }

    // delete doctors By id
    public void deleteDoctorRecord(int id) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getDoctorId() == id) {
                doctors.remove(i);
                return;
            }
        }
        System.out.println("Doctors not found.");
    }

    private Patient findPatientById(int id) {
        for (Patient p : patients) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }

    /// inputs taking
    public void addPatientByInput() {

        System.out.print("Enter Patient ID: ");
        int patientId = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter Patient Name: ");
        String patientName = input.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Patient Gender: ");
        String gender = input.nextLine();

        System.out.println("Select Patient Type:");
        System.out.println("1. InPatient");
        System.out.println("2. OutPatient");
        int choice = input.nextInt();
        input.nextLine();

        Patient patient;

        if (choice == 1) {
            System.out.print("Enter Room Number: ");
            int roomNo = input.nextInt();
            input.nextLine();

            System.out.print("Enter Check-In Date: ");
            String checkInDate = input.nextLine();

            patient = new InPatient(
                    patientId, patientName, age, gender, roomNo, checkInDate);

        } else if (choice == 2) {
            System.out.print("Enter Check-Out Date: ");
            String checkOutDate = input.nextLine();

            patient = new OutPatient(
                    patientId, patientName, age, gender, checkOutDate);

        } else {
            System.out.println("Invalid patient type.");
            return;
        }

        addPatient(patient); // reuse CREATE method
    }

    // bill
    public void addBillByInput() {

        System.out.print("Enter Patient ID for Bill: ");
        int patientId = input.nextInt();
        input.nextLine();

        Patient patient = findPatientById(patientId);

        if (patient == null) {
            System.out.println("Patient not found. Cannot generate bill.");
            return;
        }

        System.out.print("Enter Bill Number: ");
        int billNo = input.nextInt();

        System.out.print("Enter Bill Amount: ");
        double billAmount = input.nextDouble();

        Bill bill = new Bill(billNo, billAmount, patient);
        bill.payableAmount(); // calculate GST & total

        bills.add(bill);

        System.out.println("Bill generated successfully.");
    }

    // doctor
    public void addDoctorByInput() {

        System.out.print("Enter Doctor ID: ");
        int doctorId = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter Doctor Name: ");
        String doctorName = input.nextLine();

        System.out.print("Enter Doctor Gender: ");
        String doctorGender = input.nextLine();

        System.out.print("Enter Doctor Qualification: ");
        String doctorQualification = input.nextLine();

        System.out.print("Enter Years of Experience: ");
        double experience = input.nextDouble();
        input.nextLine();

        Doctor doctor = new Doctor(
                doctorId,
                doctorName,
                doctorGender,
                doctorQualification,
                experience);

        addDoctor(doctor); // reuse CREATE method
    }

}

public class HospitalPatientManagementCRUD {

    public static void main(String[] args) {
        // create objects 
        Service services = new Service();
        // add patient
        services.addPatientByInput();
        // display patient
        services.displayPatientRcords();

        // add doctors
        services.addDoctorByInput();
        // display doctors
        services.displayDoctorRcords();

        // ADD BILLS
        services.addBillByInput();
        // VIEW bILLS 
        services.viewAllBills();

    }

}
