package solutions.task977squaresofasortedarray;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int lowIndex;
        int highIndex = length - 1;
        int currentIndex = highIndex;
        int[] result = new int[length];

        for (lowIndex = 0; lowIndex <= highIndex; currentIndex--) {
            int a = Math.abs(nums[lowIndex]);
            int b = Math.abs(nums[highIndex]);

            if (a >= b) {
                result[currentIndex] = a * a;
                lowIndex++;
            } else {
                result[currentIndex] = b * b;
                highIndex--;
            }
        }
        return result;
    }
}
