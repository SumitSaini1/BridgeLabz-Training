package OnlineClassroomAttendanceTracker;

public class Session {
	private String sessionId;
	private String sessionName;
	public Session(String sessionId, String sessionName) {
		this.sessionId = sessionId;
		this.sessionName = sessionName;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	
	
}
