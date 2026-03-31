package EmployeeLeaveManagementSystem;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class LeaveService {
	Scanner input=new Scanner(System.in);
	ArrayList<LeaveRequest> leaves=new ArrayList<>();
	HashMap<String,Employee> employees=new HashMap<>();
	
	// add employee
	public void addEmployee(Employee emp) {
		employees.putIfAbsent(emp.getId(),emp);
		
	}
	// search employee by id 
	public Employee searchEmployeById(String id) {
		
		if(employees.isEmpty()) {
			return null;
		}else {
			Employee employee=employees.get(id);
			return employee;
			
		}
	}
	
	// add leave
	public boolean requestLeave(LeaveRequest leave)throws InsufficientLeaveBalanceException {
		if(leave.employee.getLeaveBalance()==0) {
			throw new InsufficientLeaveBalanceException("You Dont have Leave Balance to request:");
			
			
			
		}
		leave.employee.setIsleaveRequest(true);
		leaves.add(leave);
		return true;

		
		
		
	}
	// reject approved leaves 
	public void approvedRejectLeaves() {
		System.out.println("===========Leave Accepted or Reject A/R========");
		if(leaves.isEmpty()) {
			System.out.println("No leaves of employees to see:");
		}
		for(LeaveRequest l: leaves) {
			if(l.isChecked()) {
				continue ;
				
			}
			System.out.println(l);
			System.out.println("Type A/R to resolve Leave ticket");
			char status=input.next().charAt(0);
			if(Character.toUpperCase(status)=='A') {
				l.setIsApproved(true);
				l.employee.setLeaveApproved(true);
				l.employee.setLeaveBalance();
				l.setChecked(true);
				
			}else if(Character.toUpperCase(status)=='R') {
				l.setIsApproved(false);
				l.employee.setLeaveApproved(false);
				l.setChecked(true);
			}else {
				throw new IllegalArgumentException("You Have to choice from A/R");
				
			}
		}
		
		
	}
	
	
	
	
	

}
