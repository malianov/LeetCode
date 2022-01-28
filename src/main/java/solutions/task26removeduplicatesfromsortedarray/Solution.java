package solutions.task26removeduplicatesfromsortedarray;

public class Solution {
    public int removeDuplicates(int[] nums) {

        int temp = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[index++] = temp;
            }
        }
        return nums.length;

        /*
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        return nums.length;
        */
    }
}
