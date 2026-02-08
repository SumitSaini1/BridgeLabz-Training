class TaskRunner extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 0; i < 1000000; i++) {
            }
        } catch (InterruptedException e) {
        }
    }
}

class StateMonitor extends Thread {
    private Thread t;

    StateMonitor(Thread t) {
        this.t = t;
    }

    public void run() {
        Thread.State last = null;
        while (true) {
            Thread.State current = t.getState();
            if (current != last) {
                System.out.println("[Monitor] " + t.getName() + " is in " + current + " state");
                last = current;
            }
            if (current == Thread.State.TERMINATED) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Summary: " + t.getName() + " went through states");
    }
}

public class ThreadStateMonitor {
    public static void main(String[] args) {
        TaskRunner t1 = new TaskRunner();
        t1.setName("Task-1");

        StateMonitor monitor = new StateMonitor(t1);

        monitor.start();
        t1.start();
    }
}
