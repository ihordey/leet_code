package org.leet.code.array;

import java.util.Arrays;

public class RotateArray {


    public void myRotate(int[] nums, int k) {
        int newSize = k % nums.length;
        int rotateIndex = nums.length - newSize;
        final int[] prefixArray = Arrays.copyOfRange(nums, rotateIndex, nums.length);

        for (int r = rotateIndex - 1, j = nums.length - 1; r >= 0; r--, j--) {
            nums[j] = nums[r];
        }
        System.arraycopy(prefixArray, 0, nums, 0, newSize);
    }


    public void rotate(int[] nums, int k) {
        int steps = k;
        if (steps > nums.length) {
            steps = (steps - nums.length) % nums.length;
        }
        final var stepsArray = new int[steps];
        final var stepIndexLimit = nums.length - steps;

        copySteps(nums, stepsArray, stepIndexLimit);
        moveData(nums, stepIndexLimit);
        copyPrefixData(nums, stepsArray);
    }

    private void copyPrefixData(int[] nums, int[] stepsArray) {
        System.arraycopy(stepsArray, 0, nums, 0, stepsArray.length);
    }

    private void moveData(int[] nums, int stepsIndexLimit) {
        for (int i = stepsIndexLimit - 1, j = nums.length - 1; i >= 0; i--, j--) {
            nums[j] = nums[i];
        }
    }

    private void copySteps(int[] nums, int[] stepsArray, int stepsIndexLimit) {
        for (int i = stepsIndexLimit, j = 0; i < nums.length; i++, j++) {
            stepsArray[j] = nums[i];
        }
    }
}
