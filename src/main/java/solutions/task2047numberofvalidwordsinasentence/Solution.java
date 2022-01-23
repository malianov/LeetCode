package solutions.task2047numberofvalidwordsinasentence;

import java.util.Arrays;

public class Solution {

    public int countValidWords(String sentence) {
        String words[] = sentence.trim().split("\\s+");
        String regex = "^([a-z]+(-?[a-z]+)?)?[!\\.,]?";

        return (int) Arrays.stream(words).filter(word -> word.matches(regex)).count();
    }
}
