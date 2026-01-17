public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int n = 1000000;

        // stringbuffer performance
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuffer.append("hello");
        }

        long endTimeBuffer = System.nanoTime();
        long bufferTime = endTimeBuffer - startTimeBuffer;

        // stringbuilder performance
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuilder.append("hello");
        }

        long endTimeBuilder = System.nanoTime();
        long builderTime = endTimeBuilder - startTimeBuilder;

        // print results
        System.out.println("stringbuffer time (ns): " + bufferTime);
        System.out.println("stringbuilder time (ns): " + builderTime);
    }
}
