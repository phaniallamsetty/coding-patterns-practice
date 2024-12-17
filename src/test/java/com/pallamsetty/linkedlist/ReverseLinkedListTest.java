package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    private final ReverseLinkedList rll;

    public ReverseLinkedListTest() {
        rll = new ReverseLinkedList();
    }

    @Test
    public void testReverseList1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode reversed = rll.reverseList(head);
        assertEquals(4, reversed.val);
        assertEquals(3, reversed.next.val);
        assertEquals(2, reversed.next.next.val);
        assertEquals(1, reversed.next.next.next.val);
    }

    @Test
    public void testReverseList2() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        ListNode reversed = rll.reverseList(head);
        assertEquals(3, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(1, reversed.next.next.val);
        assertEquals(0, reversed.next.next.next.val);
    }

    @Test
    public void testReverseList3() {
        ListNode head = new ListNode();
        ListNode reversed = rll.reverseList(head);
        assertNotNull(reversed);
        assertEquals(0, reversed.val);
        assertNull(reversed.next);
    }
}
