package solutions.task167twosumIIinputarrayissorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arrayLength = numbers.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
