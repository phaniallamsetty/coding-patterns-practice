package com.pallamsetty.slidingwindow;

/*
* Leetcode 3
* */

import java.util.HashSet;

public class LongestSubstring {
    public int getLengthOfLongestSubstring(String s) {
        int start = 0;
        int longest = 0;
        HashSet<Character> hset = new HashSet<>();

        for(int end = 0; end < s.length(); end++) {
            while(hset.contains(s.charAt(end))) {
                hset.remove(s.charAt(start));
                start++;
            }

            hset.add(s.charAt(end));
            longest = Math.max(longest, end - start + 1);
        }

        return longest;
    }
}
