import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

public class ImportantMethodDemo {

    @ImportantMethod
    public void saveData() {
    }

    @ImportantMethod(level = "LOW")
    public void logData() {
    }

    public void helperMethod() {
    }

    public static void main(String[] args) {

        Method[] methods = ImportantMethodDemo.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " -> " + annotation.level());
            }
        }
    }
}
