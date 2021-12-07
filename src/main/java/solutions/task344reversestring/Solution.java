package solutions.task344reversestring;

public class Solution {
    public void reverseString(char[] s) {
        int arrayLength = s.length;
        char temp;

        for (int i = 0; i < arrayLength / 2; i++) {
            temp = s[i];
            s[i] = s[arrayLength - i - 1];
            s[arrayLength - i - 1] = temp;
        }
    }
}
