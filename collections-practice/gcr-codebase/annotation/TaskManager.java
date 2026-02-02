import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

public class TaskManager {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface TaskInfo {
        int priority();
        String assignedTo();
    }


    @TaskInfo(priority = 1, assignedTo = "Sumit Saini")
    public void completeTask() {
        System.out.println("Task completed successfully!");
    }

    public static void main(String[] args) throws Exception {

        // Load 
        Class<TaskManager> clazz = TaskManager.class;

        // Get 
        Method method = clazz.getMethod("completeTask");

        
        if (method.isAnnotationPresent(TaskInfo.class)) {

            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Task Priority : " + taskInfo.priority());
            System.out.println("Assigned To   : " + taskInfo.assignedTo());
        }
    }
}
