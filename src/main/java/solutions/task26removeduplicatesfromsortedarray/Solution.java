package solutions.task26removeduplicatesfromsortedarray;

import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num++));
            } else {
                map.put(num, 1);
            }
        }

        int i = 0;
        SortedSet<Integer> ss = new TreeSet<>(map.keySet());
        for (Integer key : ss) {
            nums[i++] = key;
        }

        return map.size();
    }
}
