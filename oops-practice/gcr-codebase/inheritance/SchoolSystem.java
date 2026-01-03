
class Person {
    String name;
    int age;   
    // constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    // constructor
    Teacher(String name, int age, String subject) {
        // call super constructor
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;
    // constructor
    Student(String name, int age, String grade) {
        // call super constructor
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;
    // constructor
    Staff(String name, int age, String department) {
        // call super constructor
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // object 
        Teacher teacher = new Teacher("Mr. Kumar", 40, "Mathematics");
        Student student = new Student("Anita", 16, "10th Grade");
        Staff staff = new Staff("Ramesh", 35, "Administration");

        System.out.println("---- Teacher Details ----");
        teacher.displayInfo();
        teacher.displayRole();

        System.out.println("\n---- Student Details ----");
        student.displayInfo();
        student.displayRole();

        System.out.println("\n---- Staff Details ----");
        staff.displayInfo();
        staff.displayRole();
    }
}
