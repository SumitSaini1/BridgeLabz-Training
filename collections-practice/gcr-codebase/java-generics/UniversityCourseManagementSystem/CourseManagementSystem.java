package UniversityCourseManagementSystem;

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course<AssignmentCourse> c1 = new Course<>("MCA11", "Java Programming", new AssignmentCourse());

        Course<ExamCourse> c2 = new Course<>("MCA12", "Data Structures", new ExamCourse());

        Course<ResearchCourse> c3 = new Course<>("MCA13", "AI Research", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(c1);
        catalog.addCourse(c2);
        catalog.addCourse(c3);

        catalog.displayAllCourses();
    }

}
