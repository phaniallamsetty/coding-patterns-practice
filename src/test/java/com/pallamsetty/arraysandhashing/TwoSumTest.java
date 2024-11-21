package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    private final TwoSum ts;

    public TwoSumTest() {
        ts = new TwoSum();
    }

    @Test
    public void testGetTwoSum1() {
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;
        int[] expected = { 0, 1 };
        int[] actual = ts.getTwoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTwoSum2() {
        int[] nums = { 4, 5, 6 };
        int target = 10;
        int[] expected = { 0, 2 };
        int[] actual = ts.getTwoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTwoSum3() {
        int[] nums = { 5, 5 };
        int target = 10;
        int[] expected = { 0, 1 };
        int[] actual = ts.getTwoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}
