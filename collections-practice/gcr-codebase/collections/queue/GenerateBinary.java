import java.util.*;

public class GenerateBinary {
    public static void main(String[] args) {

        int n = 5;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            // generate next binary 
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
