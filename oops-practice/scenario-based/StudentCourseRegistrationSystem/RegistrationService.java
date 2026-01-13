package oops.StudentCourseRegistrationSystem;
import java.util.List;

import java.util.ArrayList;

public class RegistrationService{
    private ArrayList<Courses> courses=new ArrayList<>();
    private ArrayList<Student> students =new ArrayList<>();

    public void addCourse(Courses course){
        courses.add(course);
    }

    public void registerStudent(Student student){
        students.add(student);

    }



}

