package solutions.task70climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        for (int i = 3; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }
}
