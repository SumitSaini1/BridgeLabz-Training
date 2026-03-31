import java.lang.reflect.Constructor;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DynamicObjectCreation {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getConstructor(String.class);

        Object obj = constructor.newInstance("Sumit");
        Student student = (Student) obj;

        System.out.println(student.getName());
    }
}
