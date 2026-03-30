package oops.StudentCourseRegistrationSystem;

public class Courses{
    private int courseId;
    private String courseName;
    public Courses(int courseId,String courseName){
        this.courseId=courseId;
        this.courseName=courseName;

    }
    
    public void display(){
        System.out.println("Course ID:"+courseId);
        System.out.println("Course Name:"+courseName);
    }
    public int getCourseId(){
        return courseId;
    }

}
