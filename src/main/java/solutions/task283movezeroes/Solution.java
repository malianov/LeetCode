package solutions.task283movezeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int arrayLength = nums.length;

        for (int k = 0; k < arrayLength; k++) {
            for (int i = 0; i < arrayLength; i++) {
                if (nums[i] == 0 && i < arrayLength - 1) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
        }
    }
}
