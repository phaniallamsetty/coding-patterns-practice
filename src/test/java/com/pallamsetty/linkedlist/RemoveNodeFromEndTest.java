package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.Assertions;
import com.pallamsetty.linkedlist.helpers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveNodeFromEndTest {
    private final RemoveNodeFromEnd rnfe;

    public RemoveNodeFromEndTest() {
        rnfe = new RemoveNodeFromEnd();
    }

    @Test
    public void testRemoveNthFromEnd1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        int n = 2;

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(4);

        ListNode actual = rnfe.removeNthFromEnd(head, n);

        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testRemoveNthFromEnd2() {
        ListNode head = new ListNode(5);

        int n = 1;

        ListNode expected = null;

        ListNode actual = rnfe.removeNthFromEnd(head, n);

        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testRemoveNthFromEnd3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        int n = 2;

        ListNode expected = new ListNode(2);
        ListNode actual = rnfe.removeNthFromEnd(head, n);

        Assertions.assertLinkedLists(expected, actual);
    }
}
