package solutions.task1137nthtribonaccinumber;

public class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;

        for (int i = 3; i < n; i++) {
            array[i] = array[i - 3] + array[i - 2] + array[i - 1];
        }

        return array[n - 1] + array[n - 2] + array[n - 3];
    }
}
