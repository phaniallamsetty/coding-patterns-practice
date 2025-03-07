package com.pallamsetty.linkedlist;

/*
* Leetcode 141
* */

import com.pallamsetty.linkedlist.helpers.ListNode;

public class CycleDetection {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) return true;
        }

        return false;
    }
}
