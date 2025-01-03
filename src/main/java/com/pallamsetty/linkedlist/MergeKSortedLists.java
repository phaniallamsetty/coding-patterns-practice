package com.pallamsetty.linkedlist;

/*
* Leetcode 23
* */

import com.pallamsetty.linkedlist.helpers.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        for(int i = 0; i < lists.length; i++) {
            dummy = mergeTwoLists(dummy, lists[i]);
        }

        return dummy.next;
    }

    public ListNode mergeKListsOptimized(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }

        List<ListNode> listOfLists = Arrays.asList(lists);

        while(listOfLists.size() > 1) {
            List<ListNode> mergedLists = new ArrayList<>();

            for(int i = 0; i < listOfLists.size(); i += 2) {
                ListNode l1 = listOfLists.get(i);
                ListNode l2 = null;
                if(i + 1 < listOfLists.size()) {
                    l2 = listOfLists.get(i + 1);
                }

                mergedLists.add(mergeTwoLists(l1, l2));
            }

            listOfLists = mergedLists;
        }

        return listOfLists.get(0);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
