package com.pallamsetty.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    private final ReverseLinkedList rll;

    public ReverseLinkedListTest() {
        rll = new ReverseLinkedList();
    }

    @Test
    public void testReverseList1() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        head.next = new ReverseLinkedList.ListNode(2);
        head.next.next = new ReverseLinkedList.ListNode(3);
        head.next.next.next = new ReverseLinkedList.ListNode(4);

        ReverseLinkedList.ListNode reversed = rll.reverseList(head);
        assertEquals(4, reversed.val);
        assertEquals(3, reversed.next.val);
        assertEquals(2, reversed.next.next.val);
        assertEquals(1, reversed.next.next.next.val);
    }

    @Test
    public void testReverseList2() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(0);
        head.next = new ReverseLinkedList.ListNode(1);
        head.next.next = new ReverseLinkedList.ListNode(2);
        head.next.next.next = new ReverseLinkedList.ListNode(3);

        ReverseLinkedList.ListNode reversed = rll.reverseList(head);
        assertEquals(3, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(1, reversed.next.next.val);
        assertEquals(0, reversed.next.next.next.val);
    }

    @Test
    public void testReverseList3() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode();
        ReverseLinkedList.ListNode reversed = rll.reverseList(head);
        assertNotNull(reversed);
        assertEquals(0, reversed.val);
        assertNull(reversed.next);
    }
}
