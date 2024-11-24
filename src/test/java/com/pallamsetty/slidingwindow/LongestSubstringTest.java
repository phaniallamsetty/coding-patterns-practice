package com.pallamsetty.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringTest {
    private final LongestSubstring ls;

    public LongestSubstringTest() {
        ls = new LongestSubstring();
    }

    @Test
    public void testGetLengthOfLongestSubstring1() {
        String s = "abcabcbb";
        assertEquals(3, ls.getLengthOfLongestSubstring(s));
    }

    @Test
    public void testGetLengthOfLongestSubstring2() {
        String s = "";
        assertEquals(0, ls.getLengthOfLongestSubstring(s));
    }

    @Test
    public void testGetLengthOfLongestSubstring3() {
        String s = "5332498897553447014830721645705753324988975534470148307216457057";
        assertEquals(9, ls.getLengthOfLongestSubstring(s));
    }

    @Test
    public void testGetLengthOfLongestSubstring4() {
        String s = "bbbbb";
        assertEquals(1, ls.getLengthOfLongestSubstring(s));
    }

    @Test
    public void testGetLengthOfLongestSubstring5() {
        String s = "pwwkew";
        assertEquals(3, ls.getLengthOfLongestSubstring(s));
    }

    @Test
    public void testGetLengthOfLongestSubstring6() {
        String s = "zxyzxyz";
        assertEquals(3, ls.getLengthOfLongestSubstring(s));
    }

    @Test
    public void testGetLengthOfLongestSubstring7() {
        String s = "xxxx";
        assertEquals(1, ls.getLengthOfLongestSubstring(s));
    }
}
