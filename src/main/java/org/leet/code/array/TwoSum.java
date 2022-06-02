package org.leet.code.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            final int x = target - nums[i];
            if(valueToIndex.containsKey(x)){
                return new int[]{valueToIndex.get(x), i};
            }
            valueToIndex.put(nums[i], i);
        }
        return null;
    }
}
