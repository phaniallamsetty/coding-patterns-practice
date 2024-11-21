package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TopKFrequentElementsTest {
    private final TopKFrequentElements tkfe;

    public TopKFrequentElementsTest() {
        tkfe = new TopKFrequentElements();
    }

    @Test
    public void testGetTopKFrequentElements1() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] expected = { 1, 2 };
        int[] actual = tkfe.getTopKFrequent(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTopKFrequentElements2() {
        int[] nums = { 1 };
        int k = 1;
        int[] expected = { 1 };
        int[] actual = tkfe.getTopKFrequent(nums, k);
        assertArrayEquals(expected, actual);
    }
}
