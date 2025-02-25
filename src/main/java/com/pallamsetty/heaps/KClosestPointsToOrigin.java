package com.pallamsetty.heaps;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] getKClosest(int[][] points, int k) {
        if(k == points.length) {
            return points;
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1],
                        a[0] * a[0] + a[1] * a[1])
        );

        for(int[] point: points) {
            maxHeap.offer(point);

            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int i = 0;
        int[][] res = new int[k][2];

        while(!maxHeap.isEmpty()) {
            res[i++] = maxHeap.poll();
        }

        return res;
    }
}
