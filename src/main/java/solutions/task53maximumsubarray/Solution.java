package solutions.task53maximumsubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
