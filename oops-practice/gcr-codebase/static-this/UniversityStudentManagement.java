class Student {
    // instance variable
    String name;
    final int rollNumber;
    char grade;

    // static variables
    static int totalStudent;
    static String universityName = "GLA UNIVERSITY";

    // constructor
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent++;

    }
    // display details
    void display() {
        System.out.println("University Name:"+universityName);

        System.out.println("Roll Number:"+ rollNumber);
        System.out.println("Name:"+name);
        System.out.println("Grade:"+grade);
        

    }
    void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }
    // display total student
    static void diaplayTotalStudent() {
        System.out.println("Total Student:" + totalStudent);

    }

}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s= new Student("Rahul",125,'A');
        Student s2= new Student("Aditya ",126,'B');
        Student.diaplayTotalStudent();
        if(s instanceof Student){

            s.display();
        }else{
            System.out.println("onject not belongs to Employee object ");
        }

        System.out.println("----------------------------------------------");
        if(s2 instanceof Student){

            s2.display();
            s2.updateGrade('C');
        }else{
            System.out.println("onject not belongs to Employee object ");
        }




       
    }

}
