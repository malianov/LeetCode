package solutions.task1309decryptstringfromalphabettointegermapping;

import java.util.Map;

public class Solution {
    public String freqAlphabets(String s) {
        Map<String, Character> map = Map.ofEntries(
                Map.entry("1", 'a'),
                Map.entry("2", 'b'),
                Map.entry("3", 'c'),
                Map.entry("4", 'd'),
                Map.entry("5", 'e'),
                Map.entry("6", 'f'),
                Map.entry("7", 'g'),
                Map.entry("8", 'h'),
                Map.entry("9", 'i'),
                Map.entry("10#", 'j'),
                Map.entry("11#", 'k'),
                Map.entry("12#", 'l'),
                Map.entry("13#", 'm'),
                Map.entry("14#", 'n'),
                Map.entry("15#", 'o'),
                Map.entry("16#", 'p'),
                Map.entry("17#", 'q'),
                Map.entry("18#", 'r'),
                Map.entry("19#", 's'),
                Map.entry("20#", 't'),
                Map.entry("21#", 'u'),
                Map.entry("22#", 'v'),
                Map.entry("23#", 'w'),
                Map.entry("24#", 'x'),
                Map.entry("25#", 'y'),
                Map.entry("26#", 'z'));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String key = s.substring(i,i + 3);
                if (map.containsKey(key)) {
                    sb.append(map.get(key));
                }
                i +=2;
            } else {
                String key = String.valueOf(s.charAt(i));
                if (map.containsKey(key)) {
                    sb.append(map.get(key));
                }
            }
        }
        return sb.toString();
    }
}
