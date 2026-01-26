import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

    public static void main(String[] args) {

        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            Thread writerThread = new Thread(() -> {
                try {
                    String message = "Hello from Writer Thread!";
                    outputStream.write(message.getBytes());
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = inputStream.read()) != -1) {
                        System.out.print((char) data);
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
