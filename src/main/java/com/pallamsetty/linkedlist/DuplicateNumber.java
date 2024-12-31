package com.pallamsetty.linkedlist;

public class DuplicateNumber {
    public int findDuplicateNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] < 0) {
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }

        return nums[Math.abs(nums.length - 1)];
    }
}
