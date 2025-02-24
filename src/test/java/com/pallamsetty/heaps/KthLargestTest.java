package com.pallamsetty.heaps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestTest {
    @Test
    public void testKthLargestImpl1() {
        int[] nums = { 4, 5, 8, 2 };
        KthLargest kl = new KthLargest(3, nums);
        assertEquals(4, kl.add(3));
        assertEquals(5, kl.add(5));
        assertEquals(5, kl.add(10));
        assertEquals(8, kl.add(9));
        assertEquals(8, kl.add(4));
    }

    @Test
    public void testKthLargestImpl2() {
        int[] nums = { 7, 7, 7, 7, 8, 3 };
        KthLargest kl = new KthLargest(4, nums);
        assertEquals(7, kl.add(2));
        assertEquals(7, kl.add(10));
        assertEquals(7, kl.add(9));
        assertEquals(8, kl.add(9));
    }

    @Test
    public void testKthLargestImpl3() {
        int[] nums = { 1, 2, 3, 3 };
        KthLargest kl = new KthLargest(3, nums);
        assertEquals(3, kl.add(3));
        assertEquals(3, kl.add(5));
        assertEquals(3, kl.add(6));
        assertEquals(5, kl.add(7));
        assertEquals(6, kl.add(8));
    }
}
