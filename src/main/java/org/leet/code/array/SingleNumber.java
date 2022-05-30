package org.leet.code.array;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public int singleNumberComplex(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i = i + 2) {
            if (nums[i] != nums[i - 1]) {
                return Math.min(nums[i], nums[i - 1]);
            }
        }
        return nums[nums.length - 1];
    }
}
