package com.pallamsetty.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSum2Test {
    private final TwoSum2 ts2;

    public TwoSum2Test() {
        ts2 = new TwoSum2();
    }

    @Test
    public void testGetTwoSum1() {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 1, 2 };
        int[] actual = ts2.getTwoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTwoSum2() {
        int[] numbers = { 2, 3, 4 };
        int target = 6;
        int[] expected = { 1, 3 };
        int[] actual = ts2.getTwoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTwoSum3() {
        int[] numbers = { -1, 0 };
        int target = -1;
        int[] expected = { 1, 2 };
        int[] actual = ts2.getTwoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTwoSum4() {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 3;
        int[] expected = { 1, 2 };
        int[] actual = ts2.getTwoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTwoSum5() {
        int[] numbers = { 1, 5, 9, 11, 17, 21 };
        int target = 20;
        int[] expected = { 3, 4 };
        int[] actual = ts2.getTwoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
}
