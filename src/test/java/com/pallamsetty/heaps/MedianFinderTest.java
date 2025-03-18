package com.pallamsetty.heaps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianFinderTest {
    private final MedianFinder mf;

    public MedianFinderTest() {
        mf = new MedianFinder();
    }

    @Test
    public void testMedianFinder1() {
        mf.addNum(1);
        assertEquals(1.0, mf.findMedian(), 0.0);

        mf.addNum(3);
        assertEquals(2.0, mf.findMedian(), 0.0);

        mf.addNum(2);;
        assertEquals(2.0, mf.findMedian(), 0.0);
    }
}
