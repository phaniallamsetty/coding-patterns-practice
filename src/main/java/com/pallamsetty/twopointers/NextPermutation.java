package com.pallamsetty.twopointers;

import java.util.TreeMap;

public class NextPermutation {
    public int[] getNextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        int j = nums.length - 1;

        if(i >= 0) {
            while(j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1);
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
