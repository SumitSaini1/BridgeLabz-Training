import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PrivateFieldDemo {

    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 30);
        int value = (int) field.get(p);

        System.out.println("Modified Age: " + value);
    }
}
