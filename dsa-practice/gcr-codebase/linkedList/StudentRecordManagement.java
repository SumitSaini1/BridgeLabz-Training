public class StudentRecordManagement {

    // head points to first node
    public static Node head;
     // tail points to last node
    public static Node tail;

    public static int size;

    // node class to store student data
    public static class Node {

        int rollNumber;
        String name;
        int age;
        char grade;

        Node next;
        // constructor to create new node
        Node(int rollNumber, String name, int age, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;

            this.next = null;

        }

    }
     // add student at beginning
    public void addFirst(int rollNumber, String name, int age, char grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
         // link new node to head
        newNode.next = head;
        head = newNode;

    }
    // add student at end
    public void addLast(int rollNumber, String name, int age, char grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
      // add student at specific position
    public void addSpecificPosition(int rollNumber, String name, int age, char grade, int index) {
        if (index == 0) {
            addFirst(rollNumber, name, age, grade);
            
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(rollNumber, name, age, grade);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
     // remove student by roll number
    public void removeByRollNo(int rollNumber) {
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return;

        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.rollNumber == rollNumber) {
                prev.next = curr.next;
                size--;
                System.out.println("Record deleted ");
                return;

            }
            prev = curr;
            curr = curr.next;

        }
        System.out.println("Roll number not found");


    }
    // search student by roll number
    public void searchByRoll(int rollNumber) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("------------Student Record By Roll No:" + temp.rollNumber + "---------------------");

                System.out.println("Roll Number:" + temp.rollNumber);
                System.out.println("Student Name:" + temp.name);
                System.out.println("Age:" + temp.age);
                System.out.println("Grade:" + temp.grade);
                return;
            }
            temp = temp.next;

            i++;

        }
        
    }
    // display all student records
    public void displayStudentRecords() {
        Node temp = head;
        if (head == null) {
            System.out.println("No records found");
            return;
        }
        int i = 1;
        System.out.println("=================STUDENT RECORD=======================");
        while (temp != null) {
            System.out.println("------------Student Record:" + i + "---------------------");

            System.out.println("Roll Number:" + temp.rollNumber);
            System.out.println("Student Name:" + temp.name);
            System.out.println("Age:" + temp.age);
            System.out.println("Grade:" + temp.grade);
            temp = temp.next;
            i++;
        }

    }
     // update grade using roll number
    public void updateGradeByRollNo(int rollNumber, char grade) {
        Node temp = head;
        if (head == null) {
            System.out.println("No records presents ");
            return;
        }
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = grade;
                return;

            }
            temp = temp.next;

        }
        System.out.println("Roll number not found");

    }

    public static void main(String[] args) {
        StudentRecordManagement student = new StudentRecordManagement();

        student.addFirst(1, "Sumit ", 22, 'A');
        student.addFirst(2, "Aditya", 23, 'O');
        student.addLast(3, "Rahul", 24, 'B');
        student.addSpecificPosition(4,"Utkarsh", 50, 'C', 1);


        student.removeByRollNo(1);

        student.searchByRoll(2);

        student.updateGradeByRollNo(2, 'A');

        student.displayStudentRecords();
        System.out.println("Size:" + student.size);
    }

}

