import java.lang.reflect.*;

public class ClassInfoDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("java.util.ArrayList");

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\nFields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }
}
