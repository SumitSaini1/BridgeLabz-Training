import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

public class TodoAnnotationDemo {

    @Todo(task = "Implement authentication", assignedTo = "Sumit", priority = "HIGH")
    public void login() {
    }

    @Todo(task = "Add logging support", assignedTo = "Aditya")
    public void logging() {
    }

    @Todo(task = "Optimize database queries", assignedTo = "Rahul", priority = "LOW")
    public void optimize() {
    }

    public static void main(String[] args) {

        Method[] methods = TodoAnnotationDemo.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println(
                        method.getName() + " | " +
                        todo.task() + " | " +
                        todo.assignedTo() + " | " +
                        todo.priority()
                );
            }
        }
    }
}
