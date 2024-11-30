package com.pallamsetty.slidingwindow;

/*
* Leetcode 239
* */

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public int[] getMaxSlidingWindowBruteForce(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length - k + 1; i++) {
            int currentMax = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++) {
                if(nums[j] > currentMax) {
                    currentMax = nums[j];
                }
            }

            result[i] = currentMax;
        }

        return result;
    }

    public int[] getMaxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> q =  new LinkedList<>();

        int l = 0;
        int r = 0;

        while(r < n) {
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]) {
                q.removeLast();
            }
            q.addLast(r);

            if(l > q.getFirst()) {
                q.removeFirst();
            }

            if((r+1) >= k) {
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }

        return output;
    }
}
