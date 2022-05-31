package org.leet.code.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            intersection(nums2, nums1);
        }

        final Set<Integer> rightSet = new HashSet<>(nums2.length);
        for (Integer rv : nums2) {
            rightSet.add(rv);
        }

        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            final int key = nums1[i];
            if (rightSet.contains(key)) {
                nums1[k++] = key;
                rightSet.remove(key);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public int[] intersectionSort(int[] nums1, int[] nums2) {
        final int leftLength = nums1.length;
        final int rightLength = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        final Set<Integer> result = new HashSet<>();
        for (int l = 0, r = 0; l < leftLength && r < rightLength; ) {
            if (nums1[l] == nums2[r]) {
                result.add(nums1[l]);
                l++;
                r++;
            } else if (nums1[l] > nums2[r]) {
                r++;
            } else if (nums1[l] < nums2[r]) {
                l++;
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
