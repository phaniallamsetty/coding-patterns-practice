package com.pallamsetty.arraysandhashing;

/*
* https://neetcode.io/problems/longest-consecutive-sequence
* */

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int getLongestConsecutiveSequence(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxLen = 0;

        for(int n: nums) {
            numSet.add(n);
        }

        for(int n: numSet) {
            int len = 0;
            while(numSet.contains(n + len)) {
                len++;
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}
