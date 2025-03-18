package com.pallamsetty.heaps;

/*
* Leetcode 295
* */

import java.util.Queue;
import java.util.PriorityQueue;

public class MedianFinder {

    private Queue<Integer> smallHeap;   //maxHeap
    private Queue<Integer> largeHeap;   //minHeap

    public MedianFinder() {
        smallHeap = new PriorityQueue<>((a, b) -> b - a);
        largeHeap = new PriorityQueue<>((a, b) -> a - b);
    }

    public void addNum(int num) {
        smallHeap.add(num);

        if(smallHeap.size() - largeHeap.size() > 1 ||
            !largeHeap.isEmpty() &&
            smallHeap.peek() > largeHeap.peek()) {
            largeHeap.add(smallHeap.poll());
        }

        if(largeHeap.size() - smallHeap.size() > 1) {
            smallHeap.add(largeHeap.poll());
        }
    }

    public double findMedian() {
        if(largeHeap.isEmpty()) {
            return smallHeap.peek();
        }

        if(smallHeap.size() == largeHeap.size()) {
            return (double)(smallHeap.peek() + largeHeap.peek()) / 2;
        } else if(smallHeap.size() > largeHeap.size()) {
            return (double) smallHeap.peek();
        }

        return (double)largeHeap.peek();
    }
}
