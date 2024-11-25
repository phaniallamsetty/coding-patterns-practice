package com.pallamsetty.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermutationInStringTest {
    private final PermutationInString pis;

    public PermutationInStringTest() {
        pis = new PermutationInString();
    }

    @Test
    public void testCheckInclusion1() {
        String s1 = "abc";
        String s2 = "lecabee";
        assertTrue(pis.checkInclusion(s1, s2));
    }

    @Test
    public void testCheckInclusion2() {
        String s1 = "abc";
        String s2 = "lecaabee";
        assertFalse(pis.checkInclusion(s1, s2));
    }

    @Test
    public void testCheckInclusion3() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(pis.checkInclusion(s1, s2));
    }

    @Test
    public void testCheckInclusion4() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse(pis.checkInclusion(s1, s2));
    }
}
