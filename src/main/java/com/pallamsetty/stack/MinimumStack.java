package com.pallamsetty.stack;

import java.util.Stack;

/*
* Leetcode 155
* */

public class MinimumStack {
    private class StackItem {
        int value;
        int minimum;
        StackItem next;

        public StackItem(int value, int minimum) {
            this.value = value;
            this.minimum = minimum;
        }

        public StackItem(int value, int minimum, StackItem next) {
            this.value = value;
            this.minimum = minimum;
            this.next = next;
        }
    }

    private StackItem head;

    public MinimumStack() {
        head = null;
    }

    public void push(int val) {
        if(head == null) {
            head = new StackItem(val, val);
        } else {
            head = new StackItem(val, Math.min(head.minimum, val), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.minimum;
    }
}
