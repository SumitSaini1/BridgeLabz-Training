import java.lang.reflect.Method;

class Task {

    public void fastTask() throws InterruptedException {
        Thread.sleep(100);
    }

    public void slowTask() throws InterruptedException {
        Thread.sleep(300);
    }
}

public class MethodTimingDemo {

    public static void main(String[] args) throws Exception {

        Task task = new Task();
        Method[] methods = Task.class.getDeclaredMethods();

        for (Method method : methods) {
            long start = System.nanoTime();
            method.invoke(task);
            long end = System.nanoTime();

            System.out.println(
                    method.getName() + " took " + (end - start) + " ns"
            );
        }
    }
}
