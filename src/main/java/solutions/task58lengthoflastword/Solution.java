package solutions.task58lengthoflastword;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] temp = s.stripTrailing().split(" ");
        return temp[temp.length - 1].length();
    }
}
