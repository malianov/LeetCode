package solutions.task242validanagram;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars_s = s.toCharArray();
        char[] chars_t = t.toCharArray();

        Arrays.sort(chars_s);
        Arrays.sort(chars_t);

        return Arrays.equals(chars_s, chars_t);
    }
}
