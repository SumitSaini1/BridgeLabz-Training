package FileBackupScheduler;

public class FileBackupScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackupSchedulerClass schedule=new BackupSchedulerClass();
		try {
			schedule.addTask(new BackupTask("C/Hello",2));
			schedule.addTask(new BackupTask("C/System",5));
			schedule.addTask(new BackupTask("C/Movies",3));
			
			
			schedule.executeBackup();
			
		}catch(InvalidBackupPathException e) {
			System.out.println(e.getMessage());
		}

	}

}
