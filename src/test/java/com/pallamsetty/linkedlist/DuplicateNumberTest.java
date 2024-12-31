package com.pallamsetty.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateNumberTest {
    private final DuplicateNumber dn;

    public DuplicateNumberTest() {
        dn = new DuplicateNumber();
    }

    @Test
    public void testFindDuplicateNumber1() {
        int[] nums = { 1, 2, 3, 4, 4 };

        assertEquals(4, dn.findDuplicateNumber(nums));
    }

    @Test
    public void testFindDuplicateNumber2() {
        int[] nums = { 1, 2, 3, 2, 2 };

        assertEquals(2, dn.findDuplicateNumber(nums));
    }

    @Test
    public void testFindDuplicateNumber3() {
        int[] nums = { 1, 3, 4, 2, 2 };

        assertEquals(2, dn.findDuplicateNumber(nums));
    }

    @Test
    public void testFindDuplicateNumber4() {
        int[] nums = { 3, 1, 3, 4, 2 };

        assertEquals(3, dn.findDuplicateNumber(nums));
    }

    @Test
    public void testFindDuplicateNumber5() {
        int[] nums = { 3, 3, 3, 3, 3 };

        assertEquals(3, dn.findDuplicateNumber(nums));
    }
}
