package org.leet.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }


    public boolean containsDuplicateAsSet(int[] nums) {
        final Set<Integer> uniques = new HashSet<>();

        for (int num : nums) {
            boolean isAdded = uniques.add(num);
            if (!isAdded) {
                return true;
            }
        }
        return false;
    }
}
