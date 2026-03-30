import java.util.Scanner;
public class TwoSum {
    // This method finds two numbers whose sum is equal to the target
    public static int[] twoSum(int[] nums, int target) {
        // Loop through the array for the first number

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
              // Check the remaining elements after i
            for (int j = i + 1; j < nums.length; j++) {
                if (curr + nums[j] == target) {
                    return new int[] { i, j };

                }

            }

        }
         // If no pair is found, return an empty array
        return new int[] {};

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         // Sample input array
        int[] nums={2,7,11,15};
        // Target sum
        int target=9;
        // Call the twoSum method
        int[] result= twoSum(nums, target);
        // Print the result indexes
        for(int i=0;i<result.length;i++){
            System.out.print(nums[i] + " ");
        }

    }

}
