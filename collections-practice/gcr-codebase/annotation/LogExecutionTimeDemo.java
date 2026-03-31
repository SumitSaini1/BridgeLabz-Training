import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

public class LogExecutionTimeDemo {

    @LogExecutionTime
    public void fastMethod() throws InterruptedException {
        Thread.sleep(100);
    }

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(300);
    }

    public static void main(String[] args) throws Exception {

        LogExecutionTimeDemo obj = new LogExecutionTimeDemo();
        Method[] methods = LogExecutionTimeDemo.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();

                System.out.println(
                        method.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
