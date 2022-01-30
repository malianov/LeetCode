package solutions.task88mergesortedarray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index_1 = 0;
        int index_2 = 0;

        if (n != 0) {
            while (index_1 < m && index_2 < n) {
                if (nums1[index_1] <= nums2[index_2]) {
                    index_1++;
                } else {
                    System.arraycopy(nums1,index_1,nums1, index_1+1, m - index_1);
                    nums1[index_1] = nums2[index_2];
                    index_1++;
                    index_2++;
                    m++;
                }
            }
        }
        if (index_2 < n) {
            System.arraycopy(nums2, index_2, nums1, index_1, n - index_2);
        }
    }
}
