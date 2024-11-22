package com.pallamsetty.twopointers;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThreeSumTest {
    private final ThreeSum ts;

    public ThreeSumTest() {
        ts = new ThreeSum();
    }

    @Test
    public void testGetThreeSum1() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = new ArrayList<>();
        Integer[] current = new Integer[] { -1, -1, 2 };
        expected.add(Arrays.asList(current));
        current = new Integer[] { -1, 0, 1 };
        expected.add(Arrays.asList(current));
        List<List<Integer>> actual = ts.getThreeSum(nums);
        assertLists(expected, actual);
    }

    @Test
    public void testGetThreeSum2() {
        int[] nums = { 0, 1, 1 };
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = ts.getThreeSum(nums);
        assertLists(expected, actual);
    }

    @Test
    public void testGetThreeSum3() {
        int[] nums = { 0, 0, 0 };
        List<List<Integer>> expected = new ArrayList<>();
        Integer[] current = new Integer[] { 0, 0, 0 };
        expected.add(Arrays.asList(current));
        List<List<Integer>> actual = ts.getThreeSum(nums);
        assertLists(expected, actual);
    }

    @Test
    public void testGetThreeSum4() {
        int[] nums = { -2, 0, 0, 2, 2 };
        List<List<Integer>> expected = new ArrayList<>();
        Integer[] current = new Integer[] { -2, 0, 2 };
        expected.add(Arrays.asList(current));
        List<List<Integer>> actual = ts.getThreeSum(nums);
        assertLists(expected, actual);
    }

    private void assertLists(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        HashSet<List<Integer>> expectedhashSet = new HashSet<>();

        for(List<Integer> group: expected) {
            Collections.sort(group);
            expectedhashSet.add(group);
        }

        for(List<Integer> group: actual) {
            Collections.sort(group);
            assertTrue(expectedhashSet.contains(group));
        }
    }
}
