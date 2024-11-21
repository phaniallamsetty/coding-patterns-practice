package com.pallamsetty.arraysandhashing;

/*
* Leetcode 49
* */

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
}
