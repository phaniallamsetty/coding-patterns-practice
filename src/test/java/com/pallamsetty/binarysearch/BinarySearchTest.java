package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    private final BinarySearch bs;

    public BinarySearchTest() {
        bs = new BinarySearch();
    }

    @Test
    public void testSearch1() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        assertEquals(4, bs.search(nums, target));
    }

    @Test
    public void testSearch2() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        assertEquals(-1, bs.search(nums, target));
    }
}
