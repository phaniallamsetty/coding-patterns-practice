package com.pallamsetty.arraysandhashing;

/*
* Leetcode 217
* */

import java.util.HashMap;

public class DuplicateCheck {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(!hmap.containsKey(nums[i])) {
                hmap.put(nums[i], 1);
            } else {
                return true;
            }
        }

        return false;
    }
}
