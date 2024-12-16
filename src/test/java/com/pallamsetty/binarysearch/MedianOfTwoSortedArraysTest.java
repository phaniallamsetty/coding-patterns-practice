package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {
    private final MedianOfTwoSortedArrays motsa;

    public MedianOfTwoSortedArraysTest() {
        motsa = new MedianOfTwoSortedArrays();
    }

    @Test
    public void testGetMedian1() {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        assertEquals(2.0, motsa.getMedian(nums1, nums2), 0.0);
    }

    @Test
    public void testGetMedian2() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };

        assertEquals(2.5, motsa.getMedian(nums1, nums2), 0.0);
    }
}
