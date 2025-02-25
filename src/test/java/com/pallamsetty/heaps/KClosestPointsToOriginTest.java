package com.pallamsetty.heaps;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class KClosestPointsToOriginTest {
    private final KClosestPointsToOrigin kcpto;

    public KClosestPointsToOriginTest() {
        kcpto = new KClosestPointsToOrigin();
    }

    @Test
    public void testGetKClosest1() {
        int[][] points = {
                {1, 3}, {-2, 2}
        };
        int k = 1;
        int[][] expected = {
                {-2, 2}
        };
        int[][] actual = kcpto.getKClosest(points, k);
        assert2DArrays(expected, actual);
    }

    @Test
    public void testGetKClosest2() {
        int[][] points = {
                {3, 3}, {5, -1}, {-2, 4}
        };
        int k = 2;
        int[][] expected = {
                {3, 3}, {-2, 4}
        };
        int[][] actual = kcpto.getKClosest(points, k);
        assert2DArrays(expected, actual);
    }

    @Test
    public void testGetKClosest3() {
        int[][] points = {
                {0, 2}, {2, 2}
        };
        int k = 1;
        int[][] expected = {
                {0, 2}
        };
        int[][] actual = kcpto.getKClosest(points, k);
        assert2DArrays(expected, actual);
    }

    @Test
    public void testGetKClosest4() {
        int[][] points = {
                {0, 2}, {2, 0}, {2, 2}
        };
        int k = 2;
        int[][] expected = {
                {0, 2}, {2, 0}
        };
        int[][] actual = kcpto.getKClosest(points, k);
        assert2DArrays(expected, actual);
    }

    private void assert2DArrays(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length);
        HashSet<String> hs = new HashSet<>();

        for(int[] point: expected) {
            hs.add(point[0] + "_" + point[1]);
        }

        for(int i = 0; i < actual.length; i++) {
            assertTrue(hs.contains(actual[i][0] + "_" + actual[i][1]));
        }
    }
}
