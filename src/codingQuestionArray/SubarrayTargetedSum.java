package codingQuestionArray;
import java.util.ArrayList;
import java.util.List;

public class SubarrayTargetedSum {
    public static List<List<Integer>> findSubarraysWithSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (end < nums.length) {
            currentSum += nums[end];

            while (currentSum > targetSum) {
                currentSum -= nums[start];
                start++;
            }

            if (currentSum == targetSum) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(nums[i]);
                }
                result.add(subarray);

                // Move start pointer to find other subarrays
                currentSum -= nums[start];
                start++;
            }

            end++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int targetSum = 9;

        List<List<Integer>> subarrays = findSubarraysWithSum(nums, targetSum);
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}

