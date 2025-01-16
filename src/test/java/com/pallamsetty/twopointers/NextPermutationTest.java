package com.pallamsetty.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextPermutationTest {
    private final NextPermutation np;

    public NextPermutationTest() {
        np = new NextPermutation();
    }

    @Test
    public void testGetNextPermutation1() {
        int[] nums = { 1, 2, 3 };
        assertArrayEquals(new int[] { 1, 3, 2 }, np.getNextPermutation(nums));
    }

    @Test
    public void testGetNextPermutation2() {
        int[] nums = { 3, 2, 1 };
        assertArrayEquals(new int[] { 1, 2, 3 }, np.getNextPermutation(nums));
    }

    @Test
    public void testGetNextPermutation3() {
        int[] nums = { 1, 1, 5 };
        assertArrayEquals(new int[] { 1, 5, 1 }, np.getNextPermutation(nums));
    }
}
