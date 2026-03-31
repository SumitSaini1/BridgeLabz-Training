import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null && value.length() > maxLength.value()) {
                throw new IllegalArgumentException(
                        "Username exceeds max length of " + maxLength.value()
                );
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUsername() {
        return username;
    }
}

public class MaxLengthAnnotationDemo {

    public static void main(String[] args) {

        User user1 = new User("sumit123");
        System.out.println(user1.getUsername());

        User user2 = new User("this_username_is_too_long");
        System.out.println(user2.getUsername());
    }
}
