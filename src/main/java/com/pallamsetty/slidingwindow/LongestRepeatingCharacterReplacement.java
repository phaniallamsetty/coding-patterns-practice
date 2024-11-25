package com.pallamsetty.slidingwindow;

/*
* Leetcode 424
* */

import java.util.HashSet;

public class LongestRepeatingCharacterReplacement {
    public int getLongestSubstringLength(String s, int k) {
        int result = 0;

        HashSet<Character> charSet = new HashSet<>();
        for(char c: s.toCharArray()) {
            charSet.add(c);
        }

        for(char c: charSet) {
            int count = 0;
            int left = 0;

            for(int right = 0; right < s.length(); right++) {
                if(s.charAt(right) == c) {
                    count++;
                }

                while((right - left + 1) - count > k) {
                    if(s.charAt(left) == c) {
                        count--;
                    }
                    left++;
                }

                result = Math.max(result, right - left + 1);
            }
        }

        return result;
    }
}
