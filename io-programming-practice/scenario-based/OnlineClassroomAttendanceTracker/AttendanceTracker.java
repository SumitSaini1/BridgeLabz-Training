package OnlineClassroomAttendanceTracker;
import java.util.*;
import java.util.Map;
public class AttendanceTracker {
	Scanner input=new Scanner(System.in);
	HashSet<String> studentId=new HashSet<>();
	HashMap<String,HashSet<String>> attendance=new HashMap<>();
	
	public void addId(Student student) {
		studentId.add(student.getStudentId());
		
	}
	// Mark attendance 
	public void addSessionAttendance(Session session)throws DuplicateAttendanceException {
		String sessionId=session.getSessionId();
		System.out.println("Attendance Marking :");
		if (attendance.containsKey(sessionId)) {
	        throw new DuplicateAttendanceException(
	                "Attendance already marked for session: " + sessionId
	        );
	    }
		
		HashSet<String> ids=new HashSet<>();
		attendance.put(sessionId, ids);
		
		for(String id: studentId) {
			
			
			System.out.println("A student with StudentId:"+id);
			System.out.println("Enter P/A");
			char isStatus=input.next().charAt(0);
			if(Character.toUpperCase(isStatus)=='P') {
				ids.add(id);
				
				
			}
			
			
				
			
			
		}
		
		
	}
	// display
	public void display() {
		System.out.println("========Attendance Report===========");
		for(Map.Entry<String, HashSet<String>> entry: attendance.entrySet()) {
			String sessionId=entry.getKey();
			
			System.out.println("Session Id:"+sessionId);
			HashSet<String> ids=entry.getValue();
			
			if(ids.isEmpty()) {
				System.out.println("No student present in this session");
			}else {
				for(String id : ids) {
					System.out.println("Present:"+id);
					
				}
			}
			System.out.println("------------------------------------");
		}
	}
	
	
	

}
