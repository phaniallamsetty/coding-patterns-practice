package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Matrix2DSearchTest {
    private Matrix2DSearch m2ds;

    public Matrix2DSearchTest() {
        m2ds = new Matrix2DSearch();
    }

    @Test
    public void testSearchMatrix1() {
        int[][] matrix = {
                { 1, 2, 4, 8 },
                { 10, 11, 12, 13 },
                { 14, 20, 30, 40 }
        };
        int target = 10;

        assertTrue(m2ds.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix2() {
        int[][] matrix = {
                { 1, 2, 4, 8 },
                { 10, 11, 12, 13 },
                { 14, 20, 30, 40 }
        };
        int target = 15;

        assertFalse(m2ds.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix3() {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;

        assertTrue(m2ds.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix4() {
        int[][] matrix = {
                { 1 },
                { 3 }
        };
        int target = 3;

        assertTrue(m2ds.searchMatrix(matrix, target));
    }
}
