package solutions.task387firstuniquecharacterinastring;


import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int firstUniqChar(String s) {

        Character[] array = s.chars().mapToObj(i -> (char) i).toArray(Character[]::new);
        Map<Character, Integer> map = new HashMap<>();

        for (Character character : array) {
            map.put(character, map.containsKey(character) ? 2 : 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(array[i]).equals(1)) {
                return i;
            }
        }
        
        return -1;
    }
}
