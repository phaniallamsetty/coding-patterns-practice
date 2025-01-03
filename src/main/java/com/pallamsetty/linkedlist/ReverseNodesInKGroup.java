package com.pallamsetty.linkedlist;

/*
* Leetcode 25
* */

import com.pallamsetty.linkedlist.helpers.ListNode;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) {
            return head;
        }

        ListNode current = head;
        ListNode dummy = new ListNode();
        ListNode dummyCurrent = dummy;

        while(current != null) {
            boolean isKElements = true;
            ListNode kList = new ListNode();
            ListNode kListCurrent = kList;
            kListCurrent.next = current;
            for(int i = 0; i < k; i++) {
                if(current == null) {
                    isKElements = false;
                    break;
                }
                current = current.next;
                kListCurrent = kListCurrent.next;
            }
            kListCurrent.next = null;
            kList = kList.next;
            if(isKElements) {
                kList = reverseList(kList);
            }
            dummyCurrent.next = kList;

            if(isKElements) {
                while(dummyCurrent.next != null) {
                    dummyCurrent = dummyCurrent.next;
                }
            }
        }
        return dummy.next;
    }

    private ListNode reverseList(ListNode kList) {
        ListNode reversed = new ListNode();
        ListNode current = kList;

        while(current != null) {
            ListNode reversedCurrent = new ListNode(current.val);
            reversedCurrent.next = reversed.next;
            reversed.next = reversedCurrent;
            current = current.next;
        }

        return reversed.next;
    }
}
