import java.util.*;

class InvalidMarkException extends Exception {
    InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    String name;
    String[] subjects;
    int[] marks;

    Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }

    void validateMarks() throws InvalidMarkException {
        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Invalid mark detected for student: " + name);
            }
        }
    }

    double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        if (avg >= 75) return 'B';
        if (avg >= 60) return 'C';
        if (avg >= 40) return 'D';
        return 'F';
    }

    void displayReport() {
        System.out.println("\n----------------------------");
        System.out.println("Student Name : " + name);
        System.out.println("----------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-10s : %d%n", subjects[i], marks[i]);
        }
        System.out.printf("Average     : %.2f%n", calculateAverage());
        System.out.println("Grade       : " + calculateGrade());
        System.out.println("----------------------------");
    }
}

public class StudentReportGenerator {

    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        String[] subjects = {"Maths", "Physics", "Chemistry"};

        try {
            students.add(new Student(
                    "Amit",
                    subjects,
                    new int[]{85, 78, 90}
            ));

            students.add(new Student(
                    "Riya",
                    subjects,
                    new int[]{92, 88, 95}
            ));

            for (Student s : students) {
                s.displayReport();
            }

        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }
    }
}
