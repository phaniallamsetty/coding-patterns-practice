package com.pallamsetty.twopointers;

/*
* Leetcode 11
* */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = (right - left) * minHeight;

            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
