package FileBackupScheduler;
import java.util.*;
public class BackupSchedulerClass {
	PriorityQueue<BackupTask> queue=new PriorityQueue<>();
	public void addTask(BackupTask task) {
		queue.add(task);
	}
	public void executeBackup() {
		while(!queue.isEmpty()) {
			BackupTask task=queue.poll();
			task.execute();
		}
	}
	
}

