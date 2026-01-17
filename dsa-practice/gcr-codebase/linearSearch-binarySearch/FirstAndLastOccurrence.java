public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First occurrence index: " + first);
        System.out.println("Last occurrence index: " + last);
    }

    // Find first occurrence
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; 
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // Find last occurrence
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
