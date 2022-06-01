package org.leet.code.array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        for (int i = 0, nonZeroIndex = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, nonZeroIndex++);
            }
        }
    }

    private void swap(int[] data, int from, int to) {
        int tmp = data[from];
        data[from] = data[to];
        data[to] = tmp;
    }


    public void moveZeroesMySolution(int[] nums) {
        final int[] notZeroes = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                notZeroes[j++] = nums[i];
            }
        }
        System.arraycopy(notZeroes, 0, nums, 0, notZeroes.length);
    }
}
