package com.pallamsetty.arraysandhashing;

/*
* Leetcode 347
* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] getTopKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int n: nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] freqBuckets = new ArrayList[nums.length + 1];

        for(int i = 0; i < freqBuckets.length; i++) {
            freqBuckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> kvPair: countMap.entrySet()) {
            freqBuckets[kvPair.getValue()].add(kvPair.getKey());
        }

        int[] result = new int[k];
        int kIndex = 0;

        for(int i = nums.length; i > 0; i--) {
            if(k <= 0) {
                return result;
            }

            if(freqBuckets[i].size() > 0) {
                for(int x = 0; x < freqBuckets[i].size(); x++) {
                    result[kIndex] = freqBuckets[i].get(x);
                    kIndex++;
                    k--;

                    if(k <= 0) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
