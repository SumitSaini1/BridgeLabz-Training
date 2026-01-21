package UniversityCourseManagementSystem;

public class Course <T extends CourseType>{
    private String courseCode;
    private String courseName;
    private T courseType;
    public Course(String courseCode,String courseName,T courseType){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.courseType=courseType;
        
    }
    public T getCourseType(){
        return courseType;
    }
    void display(){
        System.out.println("==========Course details============");
        System.out.println("Course Code"+courseCode);
        System.out.println("Course Name"+courseName);
        System.out.println("Course Name"+courseType.getEvaluationMethod());
        System.out.println("-----------------------------------------");
        
    }

}