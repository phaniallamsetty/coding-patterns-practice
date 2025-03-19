package com.pallamsetty.arraysandhashing;

/*
* Leetcode 49
* */

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for(String s: strs) {
            char[] currentArr = s.toCharArray();
            Arrays.sort(currentArr);
            String sortedCurrent = new String(currentArr);

            anagramMap.putIfAbsent(sortedCurrent, new ArrayList<>());
            anagramMap.get(sortedCurrent).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public List<List<String>> groupAnagramsWithoutSorting(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for(String s: strs) {
            /* Instead of sorting and using the sorted values as the key,
                we are using a count array of 26 elements which keep track of occurrence
                or each character in the word. This will be the key as all the anagrams
                have the same array representation of occurrences of characters.
                This will be a constant space allocation per word. On top of that, the
                other space allocation will be of the hashmap which O(m) where m is
                the number of strings in the array. Time complexity depends on the longest
                string length. If it is n, this is the time it takes to populate the
                count array. This operation will be repeated m times. So the time
                complexity will be O(m*n) */
            int[] count = new int[26];

            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(s);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
