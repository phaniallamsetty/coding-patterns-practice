package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.Assertions;
import com.pallamsetty.linkedlist.helpers.ListNode;
import com.pallamsetty.linkedlist.helpers.TypeConversions;
import org.junit.Test;

public class ReverseNodesInKGroupTest {
    private final ReverseNodesInKGroup rnikg;

    public ReverseNodesInKGroupTest() {
        rnikg = new ReverseNodesInKGroup();
    }

    @Test
    public void testReverseKGroup1() {
        int[] inputArr = { 1, 2, 3, 4, 5 };
        ListNode inputList = TypeConversions.getListFromNumsArr(inputArr);
        int k = 2;
        int[] expectedArr = { 2, 1, 4, 3, 5 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = rnikg.reverseKGroup(inputList, k);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testReverseKGroup2() {
        int[] inputArr = { 1, 2, 3, 4, 5 };
        ListNode inputList = TypeConversions.getListFromNumsArr(inputArr);
        int k = 3;
        int[] expectedArr = { 3, 2, 1, 4, 5 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = rnikg.reverseKGroup(inputList, k);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testReverseKGroup3() {
        int[] inputArr = { 1, 2, 3, 4, 5, 6 };
        ListNode inputList = TypeConversions.getListFromNumsArr(inputArr);
        int k = 3;
        int[] expectedArr = { 3, 2, 1, 6, 5, 4 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = rnikg.reverseKGroup(inputList, k);
        Assertions.assertLinkedLists(expected, actual);
    }
}
