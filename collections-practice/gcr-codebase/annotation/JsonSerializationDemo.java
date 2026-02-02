import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String password;

    public User(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}

public class JsonSerializationDemo {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    JsonField annotation = field.getAnnotation(JsonField.class);

                    if (!first) json.append(",");
                    json.append("\"")
                        .append(annotation.name())
                        .append("\":");

                    Object value = field.get(obj);
                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }
                    first = false;
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {

        User user = new User("sumit", 22, "secret123");
        System.out.println(toJson(user));
    }
}
