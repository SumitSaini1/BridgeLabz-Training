package EmployeeLeaveManagementSystem;

public class Employee {
	private String id;
	private String name;
	private int leaveBalance=5;
	private boolean isleaveRequest=false;
	private boolean isLeaveApproved;
	public Employee(String id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsleaveRequest() {
		return isleaveRequest;
	}
	public void setIsleaveRequest(boolean isleaveRequest) {
		this.isleaveRequest = isleaveRequest;
	}
	public boolean isLeaveApproved() {
		return isLeaveApproved;
	}
	public void setLeaveApproved(boolean isLeaveApproved) {
		this.isLeaveApproved = isLeaveApproved;
	}
	public int getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance() {
		leaveBalance =leaveBalance--;
	}
	@Override
	public String toString() {
	    return "Employee{" +
	            "id='" + id + '\'' +
	            ", name='" + name + '\'' +
	            ", leaveBalance=" + leaveBalance +
	            ", isLeaveRequest=" + isleaveRequest +
	            ", isLeaveApproved=" + isLeaveApproved +
	            '}';
	}

	
	
	

}
