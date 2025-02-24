package com.pallamsetty.heaps;

/*
* Leetcode 703
* */

import java.util.PriorityQueue;

public class KthLargest {
    private int k;
    private PriorityQueue<Integer> minHeap;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();

        for(int num: nums) {
            addToHeapAndMaintainSize(num);
        }
    }

    public int add(int val) {
        addToHeapAndMaintainSize(val);
        return minHeap.peek();
    }

    private void addToHeapAndMaintainSize(int val) {
        minHeap.offer(val);

        if(minHeap.size() > k) {
            minHeap.poll();
        }
    }
}
