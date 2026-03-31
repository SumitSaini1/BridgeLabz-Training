import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class Service {
    public void execute() {
        System.out.println("Service executed");
    }
}

class Controller {

    @Inject
    private Service service;

    public void process() {
        service.execute();
    }
}

class SimpleDIContainer {

    public static <T> T createObject(Class<T> cls) {
        try {
            T instance = cls.getDeclaredConstructor().newInstance();

            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Object dependency =
                            field.getType().getDeclaredConstructor().newInstance();
                    field.set(instance, dependency);
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        Controller controller =
                SimpleDIContainer.createObject(Controller.class);
        controller.process();
    }
}
