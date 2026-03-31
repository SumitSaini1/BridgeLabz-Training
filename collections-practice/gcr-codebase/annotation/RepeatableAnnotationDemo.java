import java.lang.annotation.*;
import java.lang.reflect.Method;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

public class RepeatableAnnotationDemo {

    @BugReport(description = "NullPointerException occurs for null input")
    @BugReport(description = "Slow performance for large data")
    public void processData() {
        System.out.println("Processing data...");
    }

    public static void main(String[] args) throws Exception {

        Method method =
                RepeatableAnnotationDemo.class.getMethod("processData");

        BugReport[] bugReports =
                method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugReports) {
            System.out.println(bug.description());
        }
    }
}
