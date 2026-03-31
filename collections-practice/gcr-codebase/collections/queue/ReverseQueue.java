import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Stack<Integer> stack = new Stack<>();

        // move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // move elements back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue); 
    }
}
