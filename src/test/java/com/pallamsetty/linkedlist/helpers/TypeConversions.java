package com.pallamsetty.linkedlist.helpers;

public final class TypeConversions {
    public static ListNode[] getListArrayFromArray(int[][] inputArr) {
        ListNode[] lists = new ListNode[inputArr.length];
        for(int i = 0; i < inputArr.length; i++) {
            lists[i] = getListFromNumsArr(inputArr[i]);
        }
        return lists;
    }

    public static ListNode getListFromNumsArr(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for(int num: nums) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}
