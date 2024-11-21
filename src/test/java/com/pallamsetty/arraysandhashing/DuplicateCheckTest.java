package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DuplicateCheckTest {
    private final DuplicateCheck dc;

    public DuplicateCheckTest() {
        dc = new DuplicateCheck();
    }

    @Test
    public void testHasDuplicates1() {
        int[] nums = { 1, 2, 3, 3 };
        assertTrue(dc.hasDuplicate(nums));
    }

    @Test
    public void testHasDuplicates2() {
        int[] nums = { 1, 2, 3, 4 };
        assertFalse(dc.hasDuplicate(nums));
    }

    @Test
    public void testHasDuplicates3() {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        assertTrue(dc.hasDuplicate(nums));
    }
}
