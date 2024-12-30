package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CycleDetectionTest {
    private final CycleDetection cd;

    public CycleDetectionTest() {
        cd = new CycleDetection();
    }

    @Test
    public void testHasCycle1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;

        assertTrue(cd.hasCycle(head));
    }

    @Test
    public void testHasCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assertFalse(cd.hasCycle(head));
    }

    @Test
    public void testHasCycle3() {
        ListNode head = new ListNode(1);

        assertFalse(cd.hasCycle(head));
    }
}
