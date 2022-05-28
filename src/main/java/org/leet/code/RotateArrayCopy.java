package org.leet.code;

public class RotateArrayCopy {

    public void rotate(int[] nums, int k) {
        final var copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[((i + k) % nums.length)] = nums[i];
        }
        System.arraycopy(copy, 0, nums, 0, copy.length);
    }
}
