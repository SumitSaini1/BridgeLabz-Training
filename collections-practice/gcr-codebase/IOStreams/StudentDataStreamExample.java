import java.io.*;

public class StudentDataStreamExample {

    public static void main(String[] args) {

        String fileName = "student.dat";

        writeStudentData(fileName);
        readStudentData(fileName);
    }


    private static void writeStudentData(String fileName) {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            int rollNo = 101;
            String name = "Amit Sharma";
            double gpa = 8.75;

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing data.");
            e.printStackTrace();
        }
    }


    private static void readStudentData(String fileName) {

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name   : " + name);
            System.out.println("GPA    : " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading data.");
            e.printStackTrace();
        }
    }
}
