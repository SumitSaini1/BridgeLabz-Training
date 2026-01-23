import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Sumit", "HR"),
                new Employee("Rahuk", "IT"),
                new Employee("Desh", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map.computeIfAbsent(e.department, k -> new ArrayList<>())
               .add(e); 
        }

        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Employee e : entry.getValue()) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}
