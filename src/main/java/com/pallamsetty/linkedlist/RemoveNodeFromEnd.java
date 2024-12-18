package com.pallamsetty.linkedlist;

/*
* Leetcode 19
* */

import com.pallamsetty.linkedlist.helpers.ListNode;

public class RemoveNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        while(n > 0) {
            right = right.next;
            n--;
        }

        while(right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }
}
