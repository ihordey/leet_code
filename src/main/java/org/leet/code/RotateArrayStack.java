package org.leet.code;

public class RotateArrayStack {

    public void rotate(int[] nums, int k) {
        int[] stack;
        int stackCopyLimit;
        int stepsLimitIndex;

        if (k > nums.length) {
            stack = new int[nums.length + k];
            stepsLimitIndex = nums.length;
            stackCopyLimit = k;
        } else {
            stack = new int[nums.length];
            stepsLimitIndex = nums.length - k;
            stackCopyLimit = 0;
        }

        for (int i = stepsLimitIndex - 1, j = 0; i >= 0; i--, j++) {
            stack[j] = nums[i];
        }
        for (int i = 0, j = stack.length - k, l = nums.length - 1; i < k; i++, j++, l--) {
            if (l < 0) {
                l = nums.length - 1;
            }
            stack[j] = nums[l];
        }

        for (int i = stack.length - 1, j = 0; i >= stackCopyLimit; i--, j++) {
            nums[j] = stack[i];
        }
    }
}
