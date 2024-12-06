package com.pallamsetty.binarysearch;

/*
* Leetcode 153
* */

public class MinimumInSortedRotatedArray {
    public int getMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums[0];

        while(left <= right) {
            if(nums[left] < nums[right]) {
                result = Math.min(result, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;
            result = Math.min(result, nums[mid]);
            if(nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
