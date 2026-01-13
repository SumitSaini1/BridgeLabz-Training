package oops.StudentCourseRegistrationSystem;

public class StudentCourseRegistrationSystem { 
    public static void main(String[] args) {
        RegistrationService service=new RegistrationService();
        Student s1=new Student(1,"Sumit", 22, "Raya");
        Courses c1=new Courses(1, "MCA"); 
        Courses c2=new Courses(2, "BCA");
        Courses c3=new Courses(3, "BBA");
        Courses c4=new Courses(4, "PHD");
        Courses c5=new Courses(5, "MBA");
        Courses c6=new Courses(6, "Btech");     
        try{
            s1.addCourse(c1,"A");
            s1.addCourse(c2,"B");
            s1.addCourse(c6,"B");
            s1.addCourse(c4,"B");
            s1.addCourse(c5,"B");
           

        }catch(CourseLimitExceededException e){
            System.out.println(e.getMessage());

        }
        
        
        s1.displayCourse();
        s1.displayGrade();
        System.out.println("Remove course");
        s1.dropCourseById(1);
        
        

        
    }

    
}
