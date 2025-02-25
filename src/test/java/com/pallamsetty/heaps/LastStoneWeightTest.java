package com.pallamsetty.heaps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastStoneWeightTest {
    private final LastStoneWeight lsw;

    public LastStoneWeightTest() {
        lsw = new LastStoneWeight();
    }

    @Test
    public void testGetLastStoneWeight1() {
        int[] stones = { 2, 3, 6, 2, 4 };

        assertEquals(1, lsw.getLastStoneWeight(stones));
    }

    @Test
    public void testGetLastStoneWeight2() {
        int[] stones = { 1, 2 };

        assertEquals(1, lsw.getLastStoneWeight(stones));
    }

    @Test
    public void testGetLastStoneWeight3() {
        int[] stones = { 2, 7, 4, 1, 8, 1 };

        assertEquals(1, lsw.getLastStoneWeight(stones));
    }

    @Test
    public void testGetLastStoneWeight4() {
        int[] stones = { 1 };

        assertEquals(1, lsw.getLastStoneWeight(stones));
    }
}
