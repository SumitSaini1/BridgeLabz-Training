class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class running");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
        new Thread(() -> System.out.println("Lambda thread running")).start();
    }
}
