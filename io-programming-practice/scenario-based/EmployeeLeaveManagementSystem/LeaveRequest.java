package EmployeeLeaveManagementSystem;

public class LeaveRequest {
	private String leaveId;
	private String leaveName;
	private String startDate;
	private String endDate;
	private boolean isApproved;
	private boolean isChecked;
	Employee employee;
	
	public LeaveRequest(String leaveId, String leaveName, String startDate, String endDate,Employee employee) {
		this.leaveId = leaveId;
		this.leaveName = leaveName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.employee=employee;
	}
	
	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public String getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public void setIsApproved(boolean value) {
		this.isApproved=value;
	}
	@Override
	public String toString() {
	    return "Leave{" +
	            "leaveId='" + leaveId + '\'' +
	            ", leaveName='" + leaveName + '\'' +
	            ", startDate='" + startDate + '\'' +
	            ", endDate='" + endDate + '\'' +
	            ", isApproved=" + isApproved +
	            '}';
	}
	
	
	

}
