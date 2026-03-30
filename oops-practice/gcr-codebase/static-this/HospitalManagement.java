class Patient {
    // instance variable
    String name;
    int age;
    String ailment;
    // static variables
    static String hospitalName = "GLA";
    static int totalPatient = 0;
    // final
    final int patientId;

    // constructor
    Patient(String name, int age, String ailment,int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId=patientId;
        totalPatient++;

    }

    // display
    void display() {
        System.out.println("------------------Patient Details------------------------------------------");
        System.out.println("Total Patients Admitted:"+ totalPatient);
        System.out.println("Hospital Name:"+hospitalName);
        System.out.println("Patient ID:"+patientId);
        System.out.println("Name: Lathika");
        System.out.println("Age: 30");
        System.out.println("Ailment:"+ailment);

    }

    static void getTotalPatint() {
        
        System.out.println("total Patient" + totalPatient);
    }

}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p=new Patient("Hari", 25, "COld", 1855);
        
        p.display();
        
        Patient p1=new Patient("HariNath", 26, "Fever", 1856);
        p1.display();


    }
}
