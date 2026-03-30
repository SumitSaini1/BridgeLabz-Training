package oops.StudentCourseRegistrationSystem;

import java.util.List;

import java.util.ArrayList;

 
public class Student extends Person {
    private List<Courses> courses;
    private List<String> grades;
    final static int COURSELIMIT=5;

    public Student(int personId, String personName, int age, String address) {

        super(personId, personName, age, address);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public void addCourse(Courses course, String grade) throws CourseLimitExceededException {
        if(courses.size()<COURSELIMIT){
            courses.add(course);
            grades.add(grade);
            System.out.println("Course added successfully.");

        }else {
            throw new CourseLimitExceededException("Course Limit exceeds.");
            
        }
        
    }

    public void dropCourseById(int id) {
        if (courses.isEmpty()) {
            System.out.println("No course Enrolled to drop.");

        } else {
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i).getCourseId() == id) {
                    courses.remove(i);
                    grades.remove(i);   
                    System.out.println("Course removed successfully.");
                    return;
                }
            }
        }

    }

    public void displayCourse() {
        System.out.println("Student details:");
        super.display();
        System.out.println("Enrolled Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled");

        } else {
            for (Courses c : courses) {
                c.display();
            }
        }
    }

    public void displayGrade() {
        System.out.println(" Courses grades:");
        if (grades.isEmpty()) {
            System.out.println("No grades enrolled");
        } else {
            for (String g : grades) {
                System.out.println("Grade:" + g);
            }
        }
    }

}