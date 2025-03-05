package com.pallamsetty.heaps;

/*
* Leetcode 621
* */

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class TaskScheduler {
    public int getMinUnitsOfTime(char[] tasks, int n) {
        int[] counts = updateCountArray(tasks);

        PriorityQueue<Integer> maxHeap = initPriorityQueue(counts);

        return processTasksAndUpdateTime(maxHeap, n);
    }

    private int[] updateCountArray(char[] tasks) {
        int[] counts = new int[26];

        for(char task: tasks) {
            counts[task - 'A']++;
        }

        return counts;
    }

    private PriorityQueue<Integer> initPriorityQueue(int[] counts) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int cnt: counts) {
            if(cnt > 0) {
                maxHeap.add(cnt);
            }
        }

        return maxHeap;
    }

    private int processTasksAndUpdateTime(PriorityQueue<Integer> maxHeap, int n) {
        int time = 0;
        Queue<int[]> q = new LinkedList<>();

        while(!maxHeap.isEmpty() || !q.isEmpty()) {
            time++;

            if(maxHeap.isEmpty()) {
                time = q.peek()[1];
            } else {
                int cnt = maxHeap.poll() - 1;

                if(cnt > 0) {
                    q.add(new int[] { cnt, time + n });
                }
            }

            while(!q.isEmpty() && q.peek()[1] == time) {
                maxHeap.add(q.poll()[0]);
            }
        }

        return time;
    }
}
