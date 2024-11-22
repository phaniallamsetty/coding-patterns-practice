package com.pallamsetty.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContainerWithMostWaterTest {
    private final ContainerWithMostWater cwmw;

    public ContainerWithMostWaterTest() {
        cwmw = new ContainerWithMostWater();
    }

    @Test
    public void testIsPalindrome1() {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        assertEquals(49, cwmw.maxArea(heights));
    }

    @Test
    public void testIsPalindrome2() {
        int[] heights = { 1, 1 };
        assertEquals(1, cwmw.maxArea(heights));
    }

    @Test
    public void testIsPalindrome3() {
        int[] heights = { 1, 7, 2, 5, 4, 7, 3, 6 };
        assertEquals(36, cwmw.maxArea(heights));
    }

    @Test
    public void testIsPalindrome4() {
        int[] heights = { 2, 2, 2 };
        assertEquals(4, cwmw.maxArea(heights));
    }
}
