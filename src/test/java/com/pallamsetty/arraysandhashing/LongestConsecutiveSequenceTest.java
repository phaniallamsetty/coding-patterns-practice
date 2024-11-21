package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence lcs;

    public LongestConsecutiveSequenceTest() {
        lcs = new LongestConsecutiveSequence();
    }

    @Test
    public void testGetLongestConsecutiveSequence1() {
        int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
        assertEquals(4, lcs.getLongestConsecutiveSequence(nums));
    }

    @Test
    public void testGetLongestConsecutiveSequence2() {
        int[] nums = { 0, 3, 2, 5, 4, 6, 1, 1 };
        assertEquals(7, lcs.getLongestConsecutiveSequence(nums));
    }
}
