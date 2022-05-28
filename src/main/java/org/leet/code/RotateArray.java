package org.leet.code;

public class RotateArray {

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
