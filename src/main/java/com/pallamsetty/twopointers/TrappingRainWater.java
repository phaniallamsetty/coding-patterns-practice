package com.pallamsetty.twopointers;

/*
* Leetcode 42
* */

public class TrappingRainWater {
    public int maxWaterTrapped(int[] height) {
        int water = 0;
        int[] maxLeft = new int[height.length];
        int currentMax = 0;
        for(int i = 1; i < height.length; i++) {
            currentMax = Math.max(currentMax, height[i - 1]);
            maxLeft[i] = currentMax;
        }

        currentMax = 0;
        int[] maxRight = new int[height.length];
        for(int i = height.length - 2; i >= 0; i--) {
            currentMax = Math.max(currentMax, height[i + 1]);
            maxRight[i] = currentMax;
        }

        int[] minHeights = new int[height.length];
        for(int i = 0; i < height.length; i++) {
            int currentTrapped = Math.min(maxLeft[i], maxRight[i]) - height[i];

            water += (Math.max(0, currentTrapped));
        }

        return water;
    }

    public int maxWaterTrappedOptimized(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;

        int maxLeft = height[left];
        int maxRight = height[right];
        int i = 0;

        while(left < right) {
            if(maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                water += (maxLeft - height[left]);
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                water += (maxRight - height[right]);
            }
        }

        return water;
    }
}
