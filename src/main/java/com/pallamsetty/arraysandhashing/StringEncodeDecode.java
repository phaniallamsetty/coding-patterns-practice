package com.pallamsetty.arraysandhashing;

import java.util.ArrayList;
import java.util.List;

/*
* Design an algorithm to encode a list of strings to a single string.
* The encoded string is then decoded back to the original list of strings.
*
* Please implement encode and decode methods
* Example:
* Input: ["phanindra", "allamsetty", "tejaswi", "kapala"]
* */
public class StringEncodeDecode {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + len;
            result.add(str.substring(i, j));
            i = j;
        }
        return result;
    }
}
