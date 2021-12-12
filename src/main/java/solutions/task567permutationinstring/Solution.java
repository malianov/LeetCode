package solutions.task567permutationinstring;

import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);

        char[] s2Array = s2.toCharArray();

        int s1ArrayLength = s1Array.length;
        int s2ArrayLength = s2Array.length;

        for (int i = 0; i < s2ArrayLength - s1ArrayLength + 1; i++) {
            char[] s2SubArray = Arrays.copyOfRange(s2Array, i,i + s1ArrayLength);
            Arrays.sort(s2SubArray);

            System.out.println(s2SubArray);
            if (Arrays.equals(s2SubArray, s1Array)) {
                return true;
            };
        }
        System.out.println(s1Array);
        return false;
    }
}
