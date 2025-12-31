

public class CourseManagement {
    String courseName; int duration; int fee;

    static String instituteName="Gla ";

    CourseManagement(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;

    }

    void displayCourseDetails(){
        System.out.println("Course Name: "+ courseName+ "\nDuration:"+ duration+"\nfee: " +fee);
        
    } 
    static void updateInstituteName(){
        instituteName="Rajiv";


    }

    public static void main(String[] args) {
        CourseManagement c1=new CourseManagement("MCA", 2, 150000);
        CourseManagement c2=new CourseManagement("BSC", 3, 100000);
        c1.displayCourseDetails();
        System.out.println("-----------------------------------------------------------------");
        updateInstituteName();
        c2.displayCourseDetails();
        
    }
}
