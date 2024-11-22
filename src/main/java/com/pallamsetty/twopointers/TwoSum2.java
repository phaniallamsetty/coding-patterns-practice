package com.pallamsetty.twopointers;

/*
* Leetcode 167
* */

public class TwoSum2 {
    public int[] getTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                break;
            }

            if(sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { left + 1, right + 1 };
    }
}
