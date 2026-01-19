package TimeComplexity;

import java.util.Random;
import java.util.Arrays;

public class SortingLargeDataEfficiently {

    // generate random data
    public static int[] generateMarks(int n) {
        int[] marks = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            marks[i] = random.nextInt(n);
        }
        return marks;
    }

    // bubble Sort
    public static void bubbleSort(int[] marks) {
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }

    // merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // comparison Method
    public static void compareSortings(int n) {

        int[] original = generateMarks(n);

        int[] bubbleArr = Arrays.copyOf(original, original.length);
        int[] mergeArr  = Arrays.copyOf(original, original.length);
        int[] quickArr  = Arrays.copyOf(original, original.length);

        long start, end;

        System.out.println("\nDataset Size: " + n);

        // bubble Sort 
        if (n <= 10000) {
            start = System.nanoTime();
            bubbleSort(bubbleArr);
            end = System.nanoTime();
            System.out.println("Bubble Sort Time : " + (end - start) + " ns");
        } else {
            System.out.println("Bubble Sort Time : Not feasible");
        }

        // merge Sort
        start = System.nanoTime();
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time  : " + (end - start) + " ns");

        // quick Sort
        start = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time  : " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        compareSortings(1000);
        compareSortings(10000);
        compareSortings(100000);
    }
}
