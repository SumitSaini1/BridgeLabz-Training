package dao;
import model.Patient;
import com.healthclinicapp.DatabaseConnection;
import java.sql.Connection;// used to make connections

import java.sql.PreparedStatement; // used to send queries to database
import java.sql.Date;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;


public class PatientDaoImp implements PatientDao {
	@Override
	public void registerPatient(Patient patient) {
		String sql="INSERT INTO patients  (name, dob, phone, email, address, blood_group) VALUES (?,?,?,?,?,?)";
		try (Connection con=DatabaseConnection.getConnection(); PreparedStatement ps=con.prepareStatement(sql)) {
			
			ps.setString(1,patient.getName());
			ps.setDate(2, patient.getDob() != null ? Date.valueOf(patient.getDob()) : null);

			ps.setString(3,patient.getPhone());
			ps.setString(4,patient.getEmail());
			ps.setString(5,patient.getAddress());
			ps.setString(6,patient.getBloodGroup());
			
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			if(e.getMessage().contains("Duplicate")) {
				throw new RuntimeException("Phone or Email already exist");
			}else {
				throw new RuntimeException();
			}
		}
	}
	@Override
	public Patient searchById(int id) {

	    String sql = "SELECT * FROM patients WHERE id = ?";

	    try (Connection con = DatabaseConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setInt(1, id);

	        try (ResultSet rs = ps.executeQuery()) {

	            if (rs.next()) {
	                Patient p = new Patient();

	                p.setId(rs.getInt("id"));
	                p.setName(rs.getString("name"));
	                p.setDob(rs.getDate("dob").toLocalDate());
	                p.setPhone(rs.getString("phone"));
	                p.setEmail(rs.getString("email"));
	                p.setAddress(rs.getString("address"));
	                p.setBloodGroup(rs.getString("blood_group"));

	                return p;
	            }
	        }

	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }

	    return null; 
	}

	public void updatePatient(Patient p) {
		String sql="UPDATE patients SET name=?,phone=?,email=?,address=?,blood_group=? WHERE id=?";
		try(Connection con=DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			
			ps.setString(1,p.getName());
			ps.setString(2,p.getPhone());
			ps.setString(3,p.getEmail());
			ps.setString(4,p.getAddress());
			ps.setString(5,p.getBloodGroup());
			ps.setInt(6,p.getId());
			ps.executeUpdate();
			
			
			
			
			
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public ArrayList<Patient> searchByName(String name) {
	    ArrayList<Patient> patients = new ArrayList<>();
	    String sql = "SELECT * FROM patients WHERE LOWER(name) LIKE ?";

	    try (Connection con = DatabaseConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setString(1, "%" + name.toLowerCase().trim() + "%");

	        try (ResultSet rs = ps.executeQuery()) {
	            while (rs.next()) {
	                Patient p = new Patient();
	                p.setId(rs.getInt("id"));
	                p.setName(rs.getString("name"));

	                Date dob = rs.getDate("dob");
	                if (dob != null) p.setDob(dob.toLocalDate());

	                p.setPhone(rs.getString("phone"));
	                p.setEmail(rs.getString("email"));
	                p.setAddress(rs.getString("address"));
	                p.setBloodGroup(rs.getString("blood_group"));

	                patients.add(p);
	            }
	        }
	        return patients;

	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}

	
	// show all patients
	public ArrayList<Patient> displayAllPatients(){
		ArrayList<Patient> patients=new ArrayList<>();
		String sql="Select * from patients;";
		
		try(Connection con=DatabaseConnection.getConnection(); PreparedStatement ps=con.prepareStatement(sql)) {
			
			
			try (ResultSet rs=ps.executeQuery()){
				while(rs.next()) {
					Patient p=new Patient();
					p.setId(rs.getInt("id"));
					p.setName(rs.getString("name"));
					Date dob = rs.getDate("dob");
                    if (dob != null) p.setDob(dob.toLocalDate());
					p.setPhone(rs.getString("phone"));
	                p.setEmail(rs.getString("email"));
	                p.setAddress(rs.getString("address"));
	                p.setBloodGroup(rs.getString("blood_group"));
	                patients.add(p);
	                
					
					
					
				}
				
				
			}
			return patients;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	

}
