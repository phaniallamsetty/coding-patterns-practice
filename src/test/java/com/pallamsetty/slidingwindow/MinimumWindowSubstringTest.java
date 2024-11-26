package com.pallamsetty.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumWindowSubstringTest {
    private final MinimumWindowSubstring mws;

    public MinimumWindowSubstringTest() {
        mws = new MinimumWindowSubstring();
    }

    @Test
    public void testGetMinWindowBruteForce1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        assertEquals("BANC", mws.getMinWindowBruteForce(s, t));
    }

    @Test
    public void testGetMinWindowBruteForce2() {
        String s = "a";
        String t = "a";

        assertEquals("a", mws.getMinWindowBruteForce(s, t));
    }

    @Test
    public void testGetMinWindowBruteForce3() {
        String s = "a";
        String t = "aa";

        assertEquals("", mws.getMinWindowBruteForce(s, t));
    }

    @Test
    public void testGetMinWindowBruteForce4() {
        String s = "OUZODYXAZV";
        String t = "XYZ";

        assertEquals("YXAZ", mws.getMinWindowBruteForce(s, t));
    }

    @Test
    public void testGetMinWindowBruteForce5() {
        String s = "xyz";
        String t = "xyz";

        assertEquals("xyz", mws.getMinWindowBruteForce(s, t));
    }

    @Test
    public void testGetMinWindowBruteForce6() {
        String s = "x";
        String t = "xy";

        assertEquals("", mws.getMinWindowBruteForce(s, t));
    }

    @Test
    public void testGetMinWindowSlidingWindow1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        assertEquals("BANC", mws.getMinWindowSlidingWindow(s, t));
    }

    @Test
    public void testGetMinWindowSlidingWindow2() {
        String s = "a";
        String t = "a";

        assertEquals("a", mws.getMinWindowSlidingWindow(s, t));
    }

    @Test
    public void testGetMinWindowSlidingWindow3() {
        String s = "a";
        String t = "aa";

        assertEquals("", mws.getMinWindowSlidingWindow(s, t));
    }

    @Test
    public void testGetMinWindowSlidingWindow4() {
        String s = "OUZODYXAZV";
        String t = "XYZ";

        assertEquals("YXAZ", mws.getMinWindowSlidingWindow(s, t));
    }

    @Test
    public void testGetMinWindowSlidingWindow5() {
        String s = "xyz";
        String t = "xyz";

        assertEquals("xyz", mws.getMinWindowSlidingWindow(s, t));
    }

    @Test
    public void testGetMinWindowSlidingWindow6() {
        String s = "x";
        String t = "xy";

        assertEquals("", mws.getMinWindowSlidingWindow(s, t));
    }
}
