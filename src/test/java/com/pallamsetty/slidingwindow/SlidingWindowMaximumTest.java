package com.pallamsetty.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SlidingWindowMaximumTest {
    private final SlidingWindowMaximum swm;

    public SlidingWindowMaximumTest() {
        swm = new SlidingWindowMaximum();
    }

    @Test
    public void testGetMaxSlidingWindowBruteForce1() {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] expected = { 3, 3, 5, 5, 6, 7 };
        int[] actual = swm.getMaxSlidingWindowBruteForce(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetMaxSlidingWindowBruteForce2() {
        int[] nums = { 1 };
        int k = 1;
        int[] expected = { 1 };
        int[] actual = swm.getMaxSlidingWindowBruteForce(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetMaxSlidingWindowBruteForce3() {
        int[] nums = { 1, 2, 1, 0, 4, 2, 6 };
        int k = 3;
        int[] expected = { 2, 2, 4, 4, 6 };
        int[] actual = swm.getMaxSlidingWindowBruteForce(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetMaxSlidingWindow1() {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] expected = { 3, 3, 5, 5, 6, 7 };
        int[] actual = swm.getMaxSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetMaxSlidingWindow2() {
        int[] nums = { 1 };
        int k = 1;
        int[] expected = { 1 };
        int[] actual = swm.getMaxSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetMaxSlidingWindow3() {
        int[] nums = { 1, 2, 1, 0, 4, 2, 6 };
        int k = 3;
        int[] expected = { 2, 2, 4, 4, 6 };
        int[] actual = swm.getMaxSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }
}
