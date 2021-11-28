package solutions.task35searchinsertpositions;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int min_index = 0;
        int max_index = nums.length;
        int index = 0;

        while (min_index < max_index) {
            index = min_index / 2 + max_index / 2;

            if (nums[index] == target) {
                return index;
            } else if (nums[index] < target) {
                min_index = index + 1;
            } else {
                max_index = index;
            }

            if (max_index == min_index) {
                return max_index;
            }
        }
        return index;
    }
}
