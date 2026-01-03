
class Course {
    // instance variable 
    protected String courseName;
    protected int duration;
    // constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;

    }
    
    public void displayDetails() {
        System.out.println("Course Name:" + courseName);
        System.out.println("Course Duration:" + duration);

    }

}
// OnlineClass inherit super class Course
class OnlineClass extends Course {
    protected String platform;
    protected boolean isRecorded;
    // constructor
    OnlineClass(String platform, boolean isRecorded, String courseName, int duaration) {
        // call super constructor 
        super(courseName, duaration);
        this.platform = platform;
        this.isRecorded = isRecorded;

    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform:" + platform);
        System.out.println("IsRecorded:" + isRecorded);

    }

}
// inherit OnlineClass 
class PaidOnlineCourse extends OnlineClass {
    float fee;
    float discountAmount;
    static int discountPercent = 5;

    PaidOnlineCourse(float fee, String platform, boolean isRecorded, String courseName, int duaration) {
        // call parent constructor
        super(platform, isRecorded, courseName, duaration);
        this.fee = fee;

    }
    // calculate fee after discount
    public void calculateFeeDiscount() {
        discountAmount = (fee * discountPercent) / 100;
        fee = fee - discountAmount;
    }

    // print display 
    public void displayDetails() {
        System.out.println("-----------------------DISPLAY COURSE DETAILS---------------------------");
        super.displayDetails();

        System.out.println("Discount Percent:" + discountPercent);
        System.out.println("Discount Amount:" + discountAmount);
        System.out.println("Total Fee:" + fee);

    }

}

public class EducationalCourseHierarchy {

    public static void main(String[] args) {
        // object created 
        PaidOnlineCourse obj = new PaidOnlineCourse(2545.5f, "Coursera", true, "Data Analytics", 06);
        // call method to calculate fee 
        obj.calculateFeeDiscount();
        obj.displayDetails();



    }

}
    