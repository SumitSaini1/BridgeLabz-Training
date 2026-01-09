class Node {

    int taskId;
    String taskName;
    int priority;
    String dueDate;

    Node next;

    Node(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {

    public static Node head;
    public static Node tail;
    public static Node current;
    public static int size;

    // add task at beginning
    public void addBeginning(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        size++;

        if (head == null) {
            head = tail = current = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    // add task at end
    public void addLast(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        size++;

        if (head == null) {
            head = tail = current = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // add task at specific position
    public void addAtPosition(int taskId, String taskName, int priority, String dueDate, int index) {

        if (index == 0) {
            addBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(taskId, taskName, priority, dueDate);
        size++;

        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
            tail.next = head;
        }
    }

    // remove task by task ID
    public void removeTask(int taskId) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        // single node
        if (head == tail && head.taskId == taskId) {
            head = tail = current = null;
            size--;
            System.out.println("Task removed");
            return;
        }

        // remove head
        if (head.taskId == taskId) {
            head = head.next;
            tail.next = head;
            size--;
            System.out.println("Task removed");
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != head) {
            if (curr.taskId == taskId) {
                prev.next = curr.next;

                if (curr == tail) {
                    tail = prev;
                }

                size--;
                System.out.println("Task removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task not found");
    }

    // view current task and move to next
    public void viewCurrentTask() {

        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task:");
        System.out.println("Task ID: " + current.taskId);
        System.out.println("Task Name: " + current.taskName);
        System.out.println("Priority: " + current.priority);
        System.out.println("Due Date: " + current.dueDate);
        System.out.println("------------------------");

        current = current.next;
    }

    // display all tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node temp = head;
        System.out.println("===== TASK LIST =====");

        do {
            System.out.println("Task ID: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println("------------------------");
            temp = temp.next;
        } while (temp != head);
    }

    // search task by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId);
                System.out.println("Task Name: " + temp.taskName);
                System.out.println("Due Date: " + temp.dueDate);
                System.out.println("------------------------");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with this priority");
        }
    }

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addBeginning(1, "Design Module", 1, "10-02-2026");
        scheduler.addLast(2, "Write Code", 2, "12-02-2026");
        scheduler.addLast(3, "Testing", 1, "15-02-2026");
        scheduler.addAtPosition(4, "Documentation", 3, "18-02-2026", 2);

        scheduler.displayTasks();

        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        scheduler.searchByPriority(1);

        scheduler.removeTask(2);

        scheduler.displayTasks();

        System.out.println("Total Tasks: " + size);
    }
}
