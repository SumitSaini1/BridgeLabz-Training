import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> b.severity - a.severity); // higher severity first

        pq.add(new Patient("Sumit", 3));
        pq.add(new Patient("Saini", 5));
        pq.add(new Patient("Rahul", 2));

        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println(p.name); 
        }
    }
}
