package com.pallamsetty.linkedlist.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class Assertions {
    public static void assertLinkedLists(ListNode expected, ListNode actual) {
        int expectedCount = getLinkedListSize(expected);
        int actualCount = getLinkedListSize(actual);

        assertEquals(expectedCount, actualCount);

        while(actual != null) {
            assertEquals(expected.val, actual.val);

            expected = expected.next;
            actual = actual.next;
        }
    }

    private static int getLinkedListSize(ListNode head) {
        int count = 0;
        ListNode current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void assertLinkedListsWithRandomPointer(NodeWithRandom expected, NodeWithRandom actual) {
        int expectedSize = getLinkedListWithRandomPointerSize(expected);
        int actualSize = getLinkedListWithRandomPointerSize(actual);

        assertEquals(expectedSize, actualSize);

        // Verify all elements in the node.
        while(actual != null) {
            assertEquals(expected.val, actual.val);

            if(expected.next == null) {
                assertNull(actual.next);
            } else {
                assertEquals(expected.next.val, actual.next.val);
            }

            if(expected.random == null) {
                assertNull(actual.random);
            } else {
                assertEquals(expected.random.val, actual.random.val);
            }

            expected = expected.next;
            actual = actual.next;
        }
    }

    private static int getLinkedListWithRandomPointerSize(NodeWithRandom head) {
        NodeWithRandom current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}
