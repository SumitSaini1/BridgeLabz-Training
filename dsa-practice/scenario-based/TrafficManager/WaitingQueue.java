package TrafficManager;

public class WaitingQueue {

	private String[] queue;
	private int front = 0;
	private int rear = -1;
	private int size;

	WaitingQueue(int capacity) {
		queue = new String[capacity];
		size = capacity;
	}

	// enqueue
	public void enqueue(String car) {
		if (rear == size - 1) {
			System.out.println("Overflow ");
			return;

		}
		queue[++rear] = car;
	}

	public String dequeue() {
		if (front > rear) {
			System.out.println("Queue Underflow");
			return null;
		}
		return queue[front++];
	}

	public boolean isEmpty() {
		return front > rear;
	}

}
