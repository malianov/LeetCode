package solutions.task3longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxLength = 0;
        int counter = 0;

        Set<Character> chars = new HashSet<>();

        for (int k = 0; k < length; k++) {
            char ch = s.charAt(k);
            chars.add(ch);
            counter = 1;

            for (int i = k + 1; i < length; i++) {
                if (chars.contains(s.charAt(i))) {
                    break;
                } else {
                    chars.add(s.charAt(i));
                    counter++;
                }

            }
            if (maxLength < counter) {
                maxLength = counter;
            }
            chars.clear();
        }
        return maxLength;
    }
}
