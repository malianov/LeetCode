package solutions.task557reversewordsinastringIII;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] wordArray = words[i].toCharArray();
            int wordArrayLength = wordArray.length;

            for (int j = 0; j < wordArrayLength / 2; j++) {
                char temp = wordArray[j];
                wordArray[j] = wordArray[wordArrayLength - j - 1];
                wordArray[wordArrayLength - j - 1] = temp;
            }
            words[i] = new String(wordArray);
        }

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word).append(" ");
        }

        return sb.toString().stripTrailing();
    }
}
