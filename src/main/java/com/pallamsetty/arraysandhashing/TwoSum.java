package com.pallamsetty.arraysandhashing;

/*
* Leetcode 1
* */

import java.util.HashMap;

public class TwoSum {
    public int[] getTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(hmap.containsKey(target - nums[i])) {
                return new int[] { hmap.get(target - nums[i]), i };
            } else {
                hmap.put(nums[i], i);
            }
        }

        return new int[] { -1, -1};
    }
}
