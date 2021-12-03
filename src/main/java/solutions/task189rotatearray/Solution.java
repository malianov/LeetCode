package solutions.task189rotatearray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int arayLength = nums.length;

        if (arayLength < k) {
            k = k % arayLength;
        }

        int[] temp = new int[arayLength];

        for (int i = 0; i < arayLength; i++) {
            if (i < k) {
                temp[i] = nums[i + arayLength - k];
            } else {
                temp[i] = nums[i - k];
            }
        }
        System.arraycopy(temp, 0, nums, 0, arayLength);
    }
}
