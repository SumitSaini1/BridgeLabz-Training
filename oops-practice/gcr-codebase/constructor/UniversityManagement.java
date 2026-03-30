class Student {
    // instance variable

    public String rollNumber;
    protected String name;
    private float CGPA;

    Student(String rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }
    // settter
    public void setCGPA(float cgpa) {
        this.CGPA=cgpa;
    }

    // geter
    public float  getCGPA() {
        return CGPA;

    }


}

class  PostgraduateStudent extends Student {
    PostgraduateStudent(String rollNumber, String name) {
        super(rollNumber, name); // calling parent constructor
    }
    void displayName(){
        System.out.println("Name: "+ name);
    }

}

public class UniversityManagement {
    public static void main(String[] args) {

        PostgraduateStudent student =
                new PostgraduateStudent("PG101", "Sumit");

        student.setCGPA(8.16f);

        System.out.println("Roll Number: " + student.rollNumber); // public
        student.displayName();                                     // protected
        System.out.println("CGPA: " + student.getCGPA());          // private via getter
    }
    

}
