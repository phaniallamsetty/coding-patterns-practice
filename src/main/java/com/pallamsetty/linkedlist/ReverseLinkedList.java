package com.pallamsetty.linkedlist;

/*
* Leetcode 206
* */

public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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
