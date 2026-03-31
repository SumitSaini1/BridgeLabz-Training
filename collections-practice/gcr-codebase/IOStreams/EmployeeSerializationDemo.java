import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSerializationDemo {

    public static void main(String[] args) {

        String fileName = "employees.ser";


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Amit", "IT", 60000));
        employeeList.add(new Employee(102, "Neha", "HR", 50000));
        employeeList.add(new Employee(103, "Ravi", "Finance", 65000));

        // Serialization
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employeeList);
            System.out.println("Employee list serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 🔹 Deserialization
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            List<Employee> deserializedList =
                    (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee List:");
            for (Employee emp : deserializedList) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
