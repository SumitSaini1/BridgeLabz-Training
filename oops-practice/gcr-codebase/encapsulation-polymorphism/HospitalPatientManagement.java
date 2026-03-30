// abstract parent class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // sensitive data (encapsulation)
    private String diagnosis;
    private String medicalHistory;

    // constructor
    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // getters
    public int getPatientId() {
        return patientId;
    }

    public int getAge() {
        return age;
    }

    // setters for sensitive data
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }

    // abstract method
    abstract void calculateBill();

    // concrete method
    void getPatientDetails() {
        System.out.println("--------------------Patient Details--------------------");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// interface
interface MedicalRecord {
    void addRecord(String diagnosis, String history);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    static final int PER_DAY_CHARGE = 2000;
    int daysAdmitted;
    double totalBill;

    InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    void calculateBill() {
        totalBill = daysAdmitted * PER_DAY_CHARGE;
    }

    public void addRecord(String diagnosis, String history) {
        setDiagnosis(diagnosis);
        setMedicalHistory(history);
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }

    void getPatientDetails() {
        calculateBill();
        super.getPatientDetails();
        System.out.println("Patient Type: In-Patient");
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Total Bill: " + totalBill);
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    static final int CONSULTATION_FEE = 500;
    double totalBill;

    OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    void calculateBill() {
        totalBill = CONSULTATION_FEE;
    }

    public void addRecord(String diagnosis, String history) {
        setDiagnosis(diagnosis);
        setMedicalHistory(history);
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }

    void getPatientDetails() {
        calculateBill();
        super.getPatientDetails();
        System.out.println("Patient Type: Out-Patient");
        System.out.println("Total Bill: " + totalBill);
    }
}

// main class
public class HospitalPatientManagement {
    public static void main(String[] args) {

        // polymorphism
        Patient p1 = new InPatient(101, "Rahul", 35, 5);
        Patient p2 = new OutPatient(102, "Amit", 27);

        // add medical records
        ((MedicalRecord) p1).addRecord("Fever", "Admitted for observation");
        ((MedicalRecord) p2).addRecord("Cold", "Prescribed medication");

        // display details
        p1.getPatientDetails();
        ((MedicalRecord) p1).viewRecords();

        System.out.println();

        p2.getPatientDetails();
        ((MedicalRecord) p2).viewRecords();
    }
}
