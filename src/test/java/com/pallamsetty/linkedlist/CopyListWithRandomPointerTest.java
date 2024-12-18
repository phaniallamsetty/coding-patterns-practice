package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.Assertions;
import com.pallamsetty.linkedlist.helpers.NodeWithRandom;
import org.junit.Test;

public class CopyListWithRandomPointerTest {
    private final CopyListWithRandomPointer clwrp;

    public CopyListWithRandomPointerTest() {
        clwrp = new CopyListWithRandomPointer();
    }

    @Test
    public void testCopyRandomList1() {
        NodeWithRandom head = new NodeWithRandom(3);
        head.next = new NodeWithRandom(7);
        head.next.next = new NodeWithRandom(4);
        head.next.next.next = new NodeWithRandom(5);

        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next;

        NodeWithRandom actual = clwrp.copyRandomList(head);
        Assertions.assertLinkedListsWithRandomPointer(head, actual);
    }

    @Test
    public void testCopyRandomList2() {
        NodeWithRandom head = new NodeWithRandom(1);
        head.next = new NodeWithRandom(2);
        head.next.next = new NodeWithRandom(3);

        head.random = null;
        head.next.random = head.next.next;
        head.next.next.random = head.next.next;

        NodeWithRandom actual = clwrp.copyRandomList(head);
        Assertions.assertLinkedListsWithRandomPointer(head, actual);
    }

    @Test
    public void testCopyRandomList3() {
        NodeWithRandom head = new NodeWithRandom(7);
        head.next = new NodeWithRandom(13);
        head.next.next = new NodeWithRandom(11);
        head.next.next.next = new NodeWithRandom(10);
        head.next.next.next.next = new NodeWithRandom(1);

        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        NodeWithRandom actual = clwrp.copyRandomList(head);
        Assertions.assertLinkedListsWithRandomPointer(head, actual);
    }

    @Test
    public void testCopyRandomList4() {
        NodeWithRandom head = new NodeWithRandom(1);
        head.next = new NodeWithRandom(2);

        head.random = head.next;
        head.next.random = head.next;

        NodeWithRandom actual = clwrp.copyRandomList(head);
        Assertions.assertLinkedListsWithRandomPointer(head, actual);
    }
}
