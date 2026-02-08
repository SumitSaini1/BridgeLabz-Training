class PrintJob implements Runnable {
    private String name;
    private int pages;

    PrintJob(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public void run() {
        for (int i = 1; i <= pages; i++) {
            System.out.println("Printing " + name + " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class PrintShop {
    public static void main(String[] args) throws Exception {
        Thread j1 = new Thread(new PrintJob("Job1", 10));
        Thread j2 = new Thread(new PrintJob("Job2", 5));
        Thread j3 = new Thread(new PrintJob("Job3", 15));
        Thread j4 = new Thread(new PrintJob("Job4", 8));
        Thread j5 = new Thread(new PrintJob("Job5", 12));

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        long start = System.currentTimeMillis();

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();

        j1.join();
        j2.join();
        j3.join();
        j4.join();
        j5.join();

        System.out.println("All jobs completed in " + (System.currentTimeMillis() - start) + "ms");
    }
}
