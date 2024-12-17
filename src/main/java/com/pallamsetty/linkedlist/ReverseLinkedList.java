package com.pallamsetty.linkedlist;

/*
* Leetcode 206
* */

import com.pallamsetty.linkedlist.helpers.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode reverse = null;

        while(current != null) {
            ListNode newNode = new ListNode(current.val);
            newNode.next = reverse;
            reverse = newNode;
            current = current.next;
        }

        return reverse;
    }
}
