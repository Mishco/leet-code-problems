package easy;

import java.util.Arrays;

public class IntersectionTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ary = new int[1001];

        for (int value : nums1) {
            ary[value]++;
        }

        int k = 0;
        for (int j : nums2) {
            if (ary[j] > 0) {
                nums1[k++] = j;
                ary[j]--;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }

}
