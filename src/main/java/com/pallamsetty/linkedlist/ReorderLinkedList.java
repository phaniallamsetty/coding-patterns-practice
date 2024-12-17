package com.pallamsetty.linkedlist;

/*
* Leetcode 143
* */

import com.pallamsetty.linkedlist.helpers.ListNode;

public class ReorderLinkedList {
    public ListNode reorderedList;

    public ReorderLinkedList() {
        reorderedList = null;
    }

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /*
        * The idea is to split the linked list into two halves, reverse the links in the
        * second half and then add the second half elements in between the first half elements.
        * */

        ListNode secondHalf = slow.next;
        ListNode previous = null;
        slow.next = null;

        // Reverse the second half
        while(secondHalf != null) {
            ListNode temp = secondHalf.next;
            secondHalf.next = previous;
            previous = secondHalf;
            secondHalf = temp;
        }

        secondHalf = previous;
        ListNode firstHalf = head;
        while(secondHalf != null) {
            ListNode firstHalfNext = firstHalf.next;
            ListNode secondHalfNext = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = firstHalfNext;
            secondHalf = secondHalfNext;
            firstHalf = firstHalfNext;
        }

        reorderedList = head;
    }

    public ListNode getReorderedList() {
        return reorderedList;
    }
}
