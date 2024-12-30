package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.Assertions;
import com.pallamsetty.linkedlist.helpers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {
    private final AddTwoNumbers atn;

    public AddTwoNumbersTest() {
        atn = new AddTwoNumbers();
    }

    @Test
    public void testAddTwoNumbers1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        ListNode expected = new ListNode(5);
        expected.next = new ListNode(7);
        expected.next.next = new ListNode(9);

        ListNode actual = atn.addTwoNumbers(l1, l2);

        Assertions.assertLinkedLists(expected, actual);
    }
}
