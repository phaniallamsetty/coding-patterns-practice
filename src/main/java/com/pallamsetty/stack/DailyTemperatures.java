package com.pallamsetty.stack;

/*
* Leetcode 739
* */

import java.util.Stack;

public class DailyTemperatures {
    public int[] getNextWarmTemperatureInDays(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int[] result = new int[temperatures.length];

        while(idx < temperatures.length) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[idx]) {
                int top = stack.pop();
                result[top] = idx - top;
            }
            stack.push(idx++);
        }
        return result;
    }

}
