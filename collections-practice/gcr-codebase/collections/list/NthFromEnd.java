import java.util.LinkedList;

public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        if (n <= 0 || list.isEmpty()) {
            throw new IllegalArgumentException("Invalid N or empty list");
        }

        var slow = list.listIterator();
        var fast = list.listIterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is greater than list size");
            }
            fast.next();
        }

        // Move both pointers until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println(findNthFromEnd(list, n)); // Output: D
    }
}
