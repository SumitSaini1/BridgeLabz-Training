package dao;
import model.Patient;
import java.util.ArrayList;
public interface PatientDao {
	void registerPatient(Patient patient);
	Patient searchById(int id);
	void updatePatient(Patient p);
	ArrayList<Patient> searchByName(String name);
	ArrayList<Patient> displayAllPatients();
	

}
