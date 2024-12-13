package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchRotatedArrayTest {
    private final SearchRotatedArray sra;

    public SearchRotatedArrayTest() {
        sra = new SearchRotatedArray();
    }

    @Test
    public void testSearch1() {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int target = 1;

        assertEquals(4, sra.searchBruteForce(nums, target));
    }

    @Test
    public void testSearch2() {
        int[] nums = { 3, 5, 6, 0, 1, 2 };
        int target = 4;

        assertEquals(-1, sra.searchBruteForce(nums, target));
    }

    @Test
    public void testSearch3() {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int target = 1;

        assertEquals(4, sra.searchBinary(nums, target));
    }

    @Test
    public void testSearch4() {
        int[] nums = { 3, 5, 6, 0, 1, 2 };
        int target = 4;

        assertEquals(-1, sra.searchBinary(nums, target));
    }
}
