package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumInSortedRotatedArrayTest {
    private final MinimumInSortedRotatedArray misra;

    public MinimumInSortedRotatedArrayTest() {
        misra = new MinimumInSortedRotatedArray();
    }

    @Test
    public void testGetMin1() {
        int[] piles = { 3, 4, 5, 6, 1, 2 };
        assertEquals(1, misra.getMin(piles));
    }

    @Test
    public void testGetMin2() {
        int[] piles = { 4, 5, 0, 1, 2, 3 };
        assertEquals(0, misra.getMin(piles));
    }

    @Test
    public void testGetMin3() {
        int[] piles = { 4, 5, 6, 7 };
        assertEquals(4, misra.getMin(piles));
    }

    @Test
    public void testGetMin4() {
        int[] piles = { 3, 4, 5, 1, 2 };
        assertEquals(1, misra.getMin(piles));
    }

    @Test
    public void testGetMin5() {
        int[] piles = { 4, 5, 6, 7, 0, 1, 2 };
        assertEquals(0, misra.getMin(piles));
    }

    @Test
    public void testGetMin6() {
        int[] piles = { 11, 13, 15, 17 };
        assertEquals(11, misra.getMin(piles));
    }
}
