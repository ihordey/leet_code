package org.leet.code.array;

/*
    Given an integer array nums and an integer k, return true if there are two distinct indices
    i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicateTwo {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateAsTreeSet(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
