package TimeComplexity;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchVSLinearSearch {

    public static int[] generateData(int n) {
        int[] data = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            data[i] = random.nextInt(n);
        }
        return data;
    }

    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target)
                return mid;
            else if (target > data[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void performs(int n) {
        int[] data = generateData(n);
        int target = data[n / 2]; 

        long startTime, endTime;

        // Linear Search
        startTime = System.nanoTime();
        linearSearch(data, target);
        endTime = System.nanoTime();
        long linearTime = endTime - startTime;

        // Binary Search
        Arrays.sort(data);
        startTime = System.nanoTime();
        binarySearch(data, target);
        endTime = System.nanoTime();
        long binaryTime = endTime - startTime;

        System.out.println("Linear Search Time : " + linearTime + " ns");
        System.out.println("Binary Search Time : " + binaryTime + " ns");
    }

    public static void main(String[] args) {
    	performs(10000);
    	performs(100000);
    	performs(1000000);

    }
}
