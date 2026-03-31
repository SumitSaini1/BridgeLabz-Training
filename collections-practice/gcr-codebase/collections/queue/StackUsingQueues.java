import java.util.*;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // push element into stack
    void push(int x) {
        q2.add(x);

        // move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // pop element from stack
    int pop() {
        return q1.remove();
    }

    // get top element
    int top() {
        return q1.peek();
    }

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); 
    }
}
