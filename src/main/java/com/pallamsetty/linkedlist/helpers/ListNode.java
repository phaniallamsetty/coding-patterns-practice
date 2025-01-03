package com.pallamsetty.linkedlist.helpers;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        this.val = Integer.MIN_VALUE;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
