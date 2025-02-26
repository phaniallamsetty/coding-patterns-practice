package com.pallamsetty.heaps;

/*
* Leetcode 215
* */

import java.util.PriorityQueue;

public class KthLargestElementInArr {
    public int getKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums) {
            minHeap.offer(num);

            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return !minHeap.isEmpty() ? minHeap.peek() : Integer.MIN_VALUE;
    }
}
