package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MergeSortedLinkedListsTest {
    private final MergeSortedLinkedLists msll;

    public MergeSortedLinkedListsTest() {
        msll = new MergeSortedLinkedLists();
    }

    @Test
    public void testMergeTwoLists1() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(5);

        ListNode actual = msll.mergeTwoLists(list1, list2);

        while(actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void testMergeTwoLists2() {
        ListNode list1 = null;

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

        ListNode actual = msll.mergeTwoLists(list1, list2);

        while(actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void testMergeTwoLists3() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode actual = msll.mergeTwoLists(list1, list2);

        assertNull(actual);
    }

    @Test
    public void testMergeTwoLists4() {
        ListNode list1 = new ListNode(1);

        ListNode list2 = null;

        ListNode expected = new ListNode(1);

        ListNode actual = msll.mergeTwoLists(list1, list2);

        while(actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
