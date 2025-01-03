package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.Assertions;
import com.pallamsetty.linkedlist.helpers.ListNode;
import com.pallamsetty.linkedlist.helpers.TypeConversions;
import org.junit.Test;

public class MergeKSortedListsTest {
    private final MergeKSortedLists mksl;

    public MergeKSortedListsTest() {
        mksl = new MergeKSortedLists();
    }

    @Test
    public void testMergeKLists1() {
        int[][] arr = {
                { 1, 2, 4 },
                { 1, 3, 5 },
                { 3, 6 }
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = { 1, 1, 2, 3, 3, 4, 5, 6 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKLists(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKLists2() {
        int[][] arr = {};
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = {};
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKLists(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKLists3() {
        int[][] arr = {
                {}
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = {};
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKLists(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKLists4() {
        int[][] arr = {
                {}
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = {};
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKLists(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKLists5() {
        int[][] arr = {
                { -4, -2, 1, 3, 5 },
                { -1, 24, 25 },
                { 7 },
                { 8 },
                { 7 },
                { 6 },
                { -7 },
                { -8 },
                { -7 },
                { -6 }
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = { -8, -7, -7, -6, -4, -2, -1, 1, 3, 5, 6, 7, 7, 8, 24, 25 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKLists(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKListsOptimized1() {
        int[][] arr = {
                { 1, 2, 4 },
                { 1, 3, 5 },
                { 3, 6 }
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = { 1, 1, 2, 3, 3, 4, 5, 6 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKListsOptimized(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKListsOptimized2() {
        int[][] arr = {};
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = {};
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKListsOptimized(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKListsOptimized3() {
        int[][] arr = {
                {}
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = {};
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKListsOptimized(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKListsOptimized4() {
        int[][] arr = {
                {}
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = {};
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKListsOptimized(lists);
        Assertions.assertLinkedLists(expected, actual);
    }

    @Test
    public void testMergeKListsOptimized5() {
        int[][] arr = {
                { -4, -2, 1, 3, 5 },
                { -1, 24, 25 },
                { 7 },
                { 8 },
                { 7 },
                { 6 },
                { -7 },
                { -8 },
                { -7 },
                { -6 }
        };
        ListNode[] lists = TypeConversions.getListArrayFromArray(arr);
        int[] expectedArr = { -8, -7, -7, -6, -4, -2, -1, 1, 3, 5, 6, 7, 7, 8, 24, 25 };
        ListNode expected = TypeConversions.getListFromNumsArr(expectedArr);
        ListNode actual = mksl.mergeKListsOptimized(lists);
        Assertions.assertLinkedLists(expected, actual);
    }
}
