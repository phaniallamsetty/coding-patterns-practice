package com.pallamsetty.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {
    private final TrappingRainWater trw;

    public TrappingRainWaterTest() {
        trw = new TrappingRainWater();
    }

    @Test
    public void testMaxWaterTrapped1() {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        assertEquals(6, trw.maxWaterTrapped(height));
    }

    @Test
    public void testMaxWaterTrapped2() {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        assertEquals(9, trw.maxWaterTrapped(height));
    }

    @Test
    public void testMaxWaterTrapped3() {
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };
        assertEquals(9, trw.maxWaterTrapped(height));
    }

    @Test
    public void testMaxWaterTrappedOptimized1() {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        assertEquals(6, trw.maxWaterTrappedOptimized(height));
    }

    @Test
    public void testMaxWaterTrappedOptimized2() {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        assertEquals(9, trw.maxWaterTrappedOptimized(height));
    }

    @Test
    public void testMaxWaterTrappedOptimized3() {
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };
        assertEquals(9, trw.maxWaterTrappedOptimized(height));
    }
}
