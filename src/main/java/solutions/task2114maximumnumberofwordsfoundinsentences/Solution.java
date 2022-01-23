package solutions.task2114maximumnumberofwordsfoundinsentences;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int length = words.length;

            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
