package org.leet.memory;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int revCount = k;
        if (k > length) {
            revCount = k % length;
        }
        final int[] copy = new int[revCount];
        int startIndex = length - revCount;

        for (int i = startIndex, j = 0; j < revCount; i++, j++) {
            copy[j] = nums[i];
        }

        for (int i = startIndex - 1, j = nums.length - 1; i >= 0; i--, j--) {
            nums[j] = nums[i];
        }
        System.arraycopy(copy, 0, nums, 0, copy.length);
    }
}
