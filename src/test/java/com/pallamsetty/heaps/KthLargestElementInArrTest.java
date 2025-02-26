package com.pallamsetty.heaps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInArrTest {
    private final KthLargestElementInArr ktleia;

    public KthLargestElementInArrTest() {
        ktleia = new KthLargestElementInArr();
    }

    @Test
    public void testGetKthLargest1() {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        assertEquals(5, ktleia.getKthLargest(nums, k));
    }

    @Test
    public void testGetKthLargest2() {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;

        assertEquals(4, ktleia.getKthLargest(nums, k));
    }

    @Test
    public void testGetKthLargest3() {
        int[] nums = { 2, 3, 1, 5, 4 };
        int k = 2;

        assertEquals(4, ktleia.getKthLargest(nums, k));
    }

    @Test
    public void testGetKthLargest4() {
        int[] nums = { 2, 3, 1, 1, 5, 5, 4 };
        int k = 3;

        assertEquals(4, ktleia.getKthLargest(nums, k));
    }
}
