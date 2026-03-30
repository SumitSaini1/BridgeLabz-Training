public class RoundRobinScheduling {

    // head points to first process
    public static Node head;
    // tail points to last process
    public static Node tail;

    public static int size;

    // node class to store process data
    public static class Node {

        int processId;
        int burstTime;
        int remainingTime;
        int priority;

        int waitingTime;
        int turnAroundTime;

        Node next;

        // constructor to create new process
        Node(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
            this.next = null;
        }
    }

    // add process at end (circular)
    public void addProcess(int processId, int burstTime, int priority) {
        Node newNode = new Node(processId, burstTime, priority);
        size++;

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // remove process by process id
    public void removeProcess(int processId) {
        if (head == null) {
            return;
        }

        Node curr = head;
        Node prev = tail;

        do {
            if (curr.processId == processId) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                } else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }

                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // simulate round robin scheduling
    public void schedule(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes available");
            return;
        }

        int time = 0;
        Node curr = head;

        while (size > 0) {

            if (curr.remainingTime > 0) {

                System.out.println("Executing Process P" + curr.processId);

                if (curr.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    curr.remainingTime -= timeQuantum;
                } else {
                    time += curr.remainingTime;
                    curr.remainingTime = 0;
                    curr.turnAroundTime = time;
                    curr.waitingTime = curr.turnAroundTime - curr.burstTime;

                    int completedProcessId = curr.processId;
                    curr = curr.next;
                    removeProcess(completedProcessId);
                    displayProcesses();
                    continue;
                }
            }

            curr = curr.next;
            displayProcesses();
        }

        calculateAverageTimes();
    }

    // display circular process list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("Process queue is empty");
            return;
        }

        Node temp = head;
        System.out.println("=========== PROCESS QUEUE ===========");
        do {
            System.out.println("Process ID: P" + temp.processId +
                               " | Remaining Time: " + temp.remainingTime +
                               " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // calculate average waiting and turnaround time
    public void calculateAverageTimes() {
        Node temp = head;
        double totalWT = 0;
        double totalTAT = 0;

        if (temp == null) {
            System.out.println("All processes completed");
            return;
        }

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnAroundTime;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Average Waiting Time: " + (totalWT / size));
        System.out.println("Average Turnaround Time: " + (totalTAT / size));
    }

    public static void main(String[] args) {

        RoundRobinScheduling scheduler = new RoundRobinScheduling();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);

        scheduler.displayProcesses();

        int timeQuantum = 3;
        System.out.println("Time Quantum: " + timeQuantum);

        scheduler.schedule(timeQuantum);
    }
}
