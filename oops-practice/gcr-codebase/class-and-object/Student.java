class Student {

    // instance variables 
    String name;
    String rollNumber;
    double mark1;
    double mark2;
    double mark3;

    // method to calculate grade
    char calculateGrade() {

        // calculate average 
        double average = (mark1 + mark2 + mark3) / 3;

        // check grade conditions
        if (average >= 75) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    // method to display 
    void displayDetails() {

        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);

        // call calculateGrade method
        char grade = calculateGrade();
        System.out.println("Grade " + grade);
    }

    public static void main(String[] args) {

        // first student object
        Student student1 = new Student();
        student1.name = "Thamarai";
        student1.rollNumber = "ECE001";
        student1.mark1 = 80.0;
        student1.mark2 = 70.0;
        student1.mark3 = 75.0;

        // second student object
        Student student2 = new Student();
        student2.name = "Kannan";
        student2.rollNumber = "CSC002";
        student2.mark1 = 60.0;
        student2.mark2 = 65.0;
        student2.mark3 = 50.0;

        // display both student reports
        student1.displayDetails();
        student2.displayDetails();
    }
}
