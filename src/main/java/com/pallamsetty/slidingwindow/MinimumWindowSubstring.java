package com.pallamsetty.slidingwindow;

/*
* Leetcode 76
* */

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    /*
    * Time Complexity: O(n ^ 2)
    * Space Complexity: O(m)
    * n is the size of s and m is the size of t
    * */
    public String getMinWindowBruteForce(String s, String t) {
        if(t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> countT = new HashMap<>();
        for(char c: t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countS = new HashMap<>();
            for(int j = i; j < s.length(); j++) {
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0) + 1);

                boolean flag = true;
                for(char c: countT.keySet()) {
                    if(countS.getOrDefault(c, 0) < countT.get(c)) {
                        flag = false;
                        break;
                    }
                }

                if(flag && (j - i + 1) < resLen) {
                    resLen = j - i + 1;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }

    public String getMinWindowSlidingWindow(String s, String t) {
        if(t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char c: t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = countT.size();
        int[] res = { -1, -1 };
        int resLen = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(countT.containsKey(c) && countT.get(c).equals(window.get(c))) {
                have++;
            }

            while(have == need) {
                if((right - left + 1) < resLen) {
                    resLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
