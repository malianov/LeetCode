package solutions.task27removeelement;

class Solution {
    public int[] removeElement(int[] nums, int val) {
        int index = 0;

        for (int element : nums) {
            if (element != val) {
                nums[index++] = element;
            }
        }
        return nums;
    }
}
