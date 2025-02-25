package com.pallamsetty.heaps;

/*
* Leetcode 1046
* */

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int getLastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stone: stones) {
            minHeap.offer(-stone);
        }

        while(minHeap.size() > 1) {
            int first = Math.abs(minHeap.poll());
            int second = Math.abs(minHeap.poll());

            if(first > second) {
                minHeap.offer(second - first);
            }
        }

        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
