package service;
import dao.PatientDaoImp;
import model.Patient;

import java.util.ArrayList;

import dao.PatientDao;
public class PatientService {
	private final PatientDao dao=new PatientDaoImp();
	public void registerPatient(Patient patient) {
		 dao.registerPatient(patient);
		
	}
	public void updatePatient(Patient patient) {
		dao.updatePatient(patient);
	}
	public Patient searchById(int id) {
		return dao.searchById(id);
	}
	public ArrayList<Patient> searchByName(String name){
		if(name==null) {
			return null;
		}else {
			 ArrayList<Patient> patients=dao.searchByName(name);
			 return patients;
			
		}
	}
	public ArrayList<Patient> displayAllPatients(){
		return  dao.displayAllPatients();
		
	}
	
	
}
