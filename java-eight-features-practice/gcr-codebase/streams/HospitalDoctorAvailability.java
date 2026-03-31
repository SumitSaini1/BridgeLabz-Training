package Streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class HospitalDoctorAvailability {

    String name;
    boolean weekendAvailability;
    String speciality;

    public HospitalDoctorAvailability(String name, boolean weekendAvailability, String speciality) {
        this.name = name;
        this.weekendAvailability = weekendAvailability;
        this.speciality = speciality;
    }


    @Override
    public String toString() {
        return "Doctor Name: " + name +
               " | Speciality: " + speciality +
               " | Weekend Available: " + weekendAvailability;
    }

    public static void main(String[] args) {

        ArrayList<HospitalDoctorAvailability> doctors = new ArrayList<>();


        doctors.add(new HospitalDoctorAvailability("Dr. Sharma", true, "Cardiology"));
        doctors.add(new HospitalDoctorAvailability("Dr. Mehta", false, "Neurology"));
        doctors.add(new HospitalDoctorAvailability("Dr. Singh", true, "Orthopedics"));
        doctors.add(new HospitalDoctorAvailability("Dr. Rao", false, "Dermatology"));

        
        List<HospitalDoctorAvailability> sortBySpeciality=doctors.stream().filter(a->a.weekendAvailability).sorted(Comparator.comparing(a->a.speciality)).toList();
        
        sortBySpeciality.forEach(System.out::println);
    }
}
