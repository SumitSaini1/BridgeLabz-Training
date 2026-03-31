package UniversityCourseManagementSystem;
import java.util.ArrayList;
public class CourseCatalog
{
    private ArrayList<Course<? extends CourseType>> courses=new ArrayList<>();
    public void addCourse(Course<? extends CourseType> course){
        courses.add(course);
    }
    public void displayAllCourses() {
        for (Course<? extends CourseType> c : courses) {
            c.display();
        }
    }




    
}
