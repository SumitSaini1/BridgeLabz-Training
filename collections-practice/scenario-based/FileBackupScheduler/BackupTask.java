package FileBackupScheduler;

public class BackupTask implements Comparable<BackupTask>{
	String folderPath;
	int priority;
	public BackupTask(String folderPath,int priority) throws InvalidBackupPathException  {
		if(folderPath==null || folderPath.isEmpty()) {
			throw new InvalidBackupPathException ("Invalid backup file path");
			
		}
		this.folderPath=folderPath;
		this.priority=priority;
		
	}
	@Override
	public int compareTo(BackupTask b) {
		return b.priority-this.priority;
	}
	public void execute() {
		System.out.println("Backing up:"+folderPath+" with priority "+priority);
		
		
		
	}

}
