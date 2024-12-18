package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.Assertions;
import com.pallamsetty.linkedlist.helpers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReorderLinkedListTest {
    private final ReorderLinkedList rll;

    public ReorderLinkedListTest() {
        rll = new ReorderLinkedList();
    }

    @Test
    public void testReorderList1() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);

        rll.reorderList(head);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(8);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(6);
        ListNode actual = rll.getReorderedList();

        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testReorderList2() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        rll.reorderList(head);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(10);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(8);
        expected.next.next.next.next = new ListNode(6);
        ListNode actual = rll.getReorderedList();

        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testReorderList3() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        head.next.next.next.next.next.next = new ListNode(14);

        rll.reorderList(head);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(14);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(12);
        expected.next.next.next.next = new ListNode(6);
        expected.next.next.next.next.next = new ListNode(10);
        expected.next.next.next.next.next.next = new ListNode(8);
        ListNode actual = rll.getReorderedList();

        Assertions.assertLinkedLists(expected, actual);
    }
}
