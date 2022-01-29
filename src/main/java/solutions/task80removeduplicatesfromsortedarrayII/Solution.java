package solutions.task80removeduplicatesfromsortedarrayII;

public class Solution {
    public int[] removeDuplicates(int[] nums) {
        int index = 0;
        int temp = nums[0];
        int flagTwo = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                index++;
                nums[index] = nums[i];
                temp = nums[i];
                flagTwo = 0;
            } else {
                if (flagTwo != 1) {
                    index++;
                    nums[index] = nums[i];
                    flagTwo = 1;
                }
            }
        }
        return nums;
    }
}
