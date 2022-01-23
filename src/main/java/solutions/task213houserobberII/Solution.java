package solutions.task213houserobberII;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int[] nums_1 = new int[nums.length - 1];
        int[] nums_2 = new int[nums.length - 1];
        System.arraycopy(nums,0,nums_1,0, nums.length - 1);
        System.arraycopy(nums,1,nums_2,0, nums.length - 1);

        return Math.max(robSubProgram(nums_1), robSubProgram(nums_2));
    }

    public int robSubProgram(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int[] money = new int[nums.length];

        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            money[i] = Math.max(money[i - 1], money[i - 2] + nums[i]);
        }

        return money[nums.length - 1];
    }
}
