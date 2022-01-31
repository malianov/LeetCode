package solutions.task709tolowercase;

public class Solution {
    public String toLowerCase(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);      // 32 = 'a' - 'A'
            }
        }

        return new String(chars);
    }
}
