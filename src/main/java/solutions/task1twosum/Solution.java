package solutions.task1twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
