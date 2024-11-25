package com.pallamsetty.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestRepeatingCharacterReplacementTest {
    private final LongestRepeatingCharacterReplacement lrcr;

    public LongestRepeatingCharacterReplacementTest() {
        lrcr = new LongestRepeatingCharacterReplacement();
    }

    @Test
    public void testGetLongestSubstringLength1() {
        String s = "ABAB";
        int k = 2;

        assertEquals(4, lrcr.getLongestSubstringLength(s, k));
    }

    @Test
    public void testGetLongestSubstringLength2() {
        String s = "AABABBA";
        int k = 1;

        assertEquals(4, lrcr.getLongestSubstringLength(s, k));
    }

    @Test
    public void testGetLongestSubstringLength3() {
        String s = "XYYX";
        int k = 2;

        assertEquals(4, lrcr.getLongestSubstringLength(s, k));
    }

    @Test
    public void testGetLongestSubstringLength4() {
        String s = "AAABABB";
        int k = 1;

        assertEquals(5, lrcr.getLongestSubstringLength(s, k));
    }
}
