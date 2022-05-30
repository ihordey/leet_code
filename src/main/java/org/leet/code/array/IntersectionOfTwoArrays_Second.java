package org.leet.code.array;

import java.util.Arrays;

public class IntersectionOfTwoArrays_Second {

    public int[] intersect(int[] nums1, int[] nums2) {
        final int leftLength = nums1.length;
        final int rightLength = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int steps = Math.min(leftLength, rightLength);
        final var result = new int[steps * 2];

        int k = 0;
        for (int i = 0, j = 0; i < leftLength && j < rightLength; ) {
            if (nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }
}
