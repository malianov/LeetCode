package solutions.task26removeduplicatesfromsortedarray;

import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        return nums.length;
    }
}
