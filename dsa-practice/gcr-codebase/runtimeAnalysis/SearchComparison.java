import java.util.HashSet;
import java.util.TreeSet;

public class SearchComparison {

    public static void main(String[] args) {

        int n = 100000;   // dataset size
        int target = n - 1;

        // Create Array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // create HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }

        // create TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(i);
        }

        // array Search (O(N))
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                break;
        }
        long arrayTime = System.nanoTime() - start;

        // hashSet Search (O(1))
        start = System.nanoTime();
        hashSet.contains(target);
        long hashSetTime = System.nanoTime() - start;

        // treeSet Search (O(log N))
        start = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - start;

        // print Results
        System.out.println("Search Performance Comparison");
        System.out.println("------------------------------");
        System.out.println("Array Search Time   : " + arrayTime / 1_000_000.0 + " ms");
        System.out.println("HashSet Search Time : " + hashSetTime / 1_000_000.0 + " ms");
        System.out.println("TreeSet Search Time : " + treeSetTime / 1_000_000.0 + " ms");
    }
}
