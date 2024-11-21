package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf poaes;

    public ProductOfArrayExceptSelfTest() {
        poaes = new ProductOfArrayExceptSelf();
    }

    @Test
    public void testGetProductOfArrayExceptSelf1() {
        int[] nums = { 1, 2, 3, 4 };
        int[] expected = { 24, 12, 8, 6 };
        int[] actual = poaes.getProductOfArrayExceptSelf(nums);
        assertArrays(expected, actual);
    }

    @Test
    public void testGetProductOfArrayExceptSelf2() {
        int[] nums = { 1, 2, 4, 6 };
        int[] expected = { 48, 24, 12, 8 };
        int[] actual = poaes.getProductOfArrayExceptSelf(nums);
        assertArrays(expected, actual);
    }

    @Test
    public void testGetProductOfArrayExceptSelf3() {
        int[] nums = { -1, 0, 1, 2, 3 };
        int[] expected = { 0, -6, 0, 0, 0 };
        int[] actual = poaes.getProductOfArrayExceptSelf(nums);
        assertArrays(expected, actual);
    }

    @Test
    public void testGetProductOfArrayExceptSelf4() {
        int[] nums = { 0, 0 };
        int[] expected = { 0, 0 };
        int[] actual = poaes.getProductOfArrayExceptSelf(nums);
        assertArrays(expected, actual);
    }

    @Test
    public void testGetProductOfArrayExceptSelf5() {
        int[] nums = { 0, 7 };
        int[] expected = { 7, 0 };
        int[] actual = poaes.getProductOfArrayExceptSelf(nums);
        assertArrays(expected, actual);
    }

    private void assertArrays(int[] expected, int[] actual) {
        assertEquals(expected.length, actual.length);

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
