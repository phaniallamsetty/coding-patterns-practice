package com.pallamsetty.binarysearch.helpers;

import java.util.ArrayList;
import java.util.List;

public class TimeValueMap {
    public List<String> values;
    public List<Integer> timestamps;

    public TimeValueMap() {
        values = new ArrayList<>();
        timestamps = new ArrayList<>();
    }

    public void add(String value, int timestamp) {
        values.add(value);
        timestamps.add(timestamp);
    }

    public int getSize() {
        return timestamps.size();
    }
}
