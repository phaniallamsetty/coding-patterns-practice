package com.pallamsetty.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestRectangleInHistogramTest {
    private final LargestRectangleInHistogram lrih;

    public LargestRectangleInHistogramTest() {
        lrih = new LargestRectangleInHistogram();
    }

    @Test
    public void testGetLargestRectangleAreaBruteForce1() {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        assertEquals(10, lrih.getLargestRectangleAreaBruteForce(heights));
    }

    @Test
    public void testGetLargestRectangleAreaBruteForce2() {
        int[] heights = { 2, 4 };
        assertEquals(4, lrih.getLargestRectangleAreaBruteForce(heights));
    }

    @Test
    public void testGetLargestRectangleAreaBruteForce3() {
        int[] heights = { 7, 1, 7, 2, 2, 4 };
        assertEquals(8, lrih.getLargestRectangleAreaBruteForce(heights));
    }

    @Test
    public void testGetLargestRectangleAreaBruteForce4() {
        int[] heights = { 1, 3, 7 };
        assertEquals(7, lrih.getLargestRectangleAreaBruteForce(heights));
    }

    @Test
    public void testGetLargestRectangleAreaStack1() {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        assertEquals(10, lrih.getLargestRectangleAreaStack(heights));
    }

    @Test
    public void testGetLargestRectangleAreaStack2() {
        int[] heights = { 2, 4 };
        assertEquals(4, lrih.getLargestRectangleAreaStack(heights));
    }

    @Test
    public void testGetLargestRectangleAreaStack3() {
        int[] heights = { 7, 1, 7, 2, 2, 4 };
        assertEquals(8, lrih.getLargestRectangleAreaStack(heights));
    }

    @Test
    public void testGetLargestRectangleAreaStack4() {
        int[] heights = { 1, 3, 7 };
        assertEquals(7, lrih.getLargestRectangleAreaStack(heights));
    }
}
