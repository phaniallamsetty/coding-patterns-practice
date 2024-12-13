package com.pallamsetty.binarysearch;

/*
* Leetcode 981
* */

import com.pallamsetty.binarysearch.helpers.TimeValueMap;

import java.util.HashMap;

public class TimeMap {
    HashMap<String, TimeValueMap> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TimeValueMap tvMap;
        if(!map.containsKey(key)) {
            map.put(key, new TimeValueMap());
        }
        tvMap = map.get(key);
        tvMap.add(value, timestamp);
        map.put(key, tvMap);
    }

    public String get(String key, int timestamp) {
        TimeValueMap tvMap = map.get(key);

        if(tvMap == null
                || tvMap.getSize() == 0
                || timestamp < tvMap.timestamps.get(0)) {
            return "";
        }

        if(timestamp >= tvMap.timestamps.get(tvMap.getSize() - 1)) {
            return tvMap.values.get(tvMap.getSize() - 1);
        }

        int left = 0;
        int right = tvMap.getSize() - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(tvMap.timestamps.get(mid) == timestamp) {
                return tvMap.values.get(mid);
            }

            if(tvMap.timestamps.get(mid) > timestamp) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if(tvMap.timestamps.get(left) == timestamp) {
            return tvMap.values.get(left);
        }

        return tvMap.values.get(Math.max(left - 1, 0));
    }
}
