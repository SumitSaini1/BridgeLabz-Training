import java.util.*;

public class HeapSortJobApplicants {

    // Heap Sort function
    public static void heapSort(int[] salary) {
        int n = salary.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salary, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            // Heapify reduced heap
            heapify(salary, i, 0);
        }
    }

    // Heapify function
    public static void heapify(int[] salary, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Compare with left child
        if (left < n && salary[left] > salary[largest]) {
            largest = left;
        }

        // Compare with right child
        if (right < n && salary[right] > salary[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = salary[i];
            salary[i] = salary[largest];
            salary[largest] = swap;

            // Recursively heapify
            heapify(salary, n, largest);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] salaryDemands = {70000, 50000, 90000, 60000, 80000};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(salaryDemands));

        heapSort(salaryDemands);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(salaryDemands));
    }
}
