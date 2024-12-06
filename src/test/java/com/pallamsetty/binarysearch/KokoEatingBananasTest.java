package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KokoEatingBananasTest {
    private final KokoEatingBananas koko;

    public KokoEatingBananasTest() {
        koko = new KokoEatingBananas();
    }

    @Test
    public void testGetMinEatingSpeedBruteForce1() {
        int[] piles = { 1, 4, 3, 2 };
        int h = 9;
        assertEquals(2, koko.getMinEatingSpeedBruteForce(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBruteForce2() {
        int[] piles = { 25, 10, 23, 4 };
        int h = 4;
        assertEquals(25, koko.getMinEatingSpeedBruteForce(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBruteForce3() {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        assertEquals(4, koko.getMinEatingSpeedBruteForce(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBruteForce4() {
        int[] piles = { 30, 11, 23, 4, 20 };
        int h = 5;
        assertEquals(30, koko.getMinEatingSpeedBruteForce(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBruteForce5() {
        int[] piles = { 30, 11, 23, 4, 20 };
        int h = 6;
        assertEquals(23, koko.getMinEatingSpeedBruteForce(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBinarySearch1() {
        int[] piles = { 1, 4, 3, 2 };
        int h = 9;
        assertEquals(2, koko.getMinEatingSpeedBinarySearch(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBinarySearch2() {
        int[] piles = { 25, 10, 23, 4 };
        int h = 4;
        assertEquals(25, koko.getMinEatingSpeedBinarySearch(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBinarySearch3() {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        assertEquals(4, koko.getMinEatingSpeedBinarySearch(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBinarySearch4() {
        int[] piles = { 30, 11, 23, 4, 20 };
        int h = 5;
        assertEquals(30, koko.getMinEatingSpeedBinarySearch(piles, h));
    }

    @Test
    public void testGetMinEatingSpeedBinarySearch5() {
        int[] piles = { 30, 11, 23, 4, 20 };
        int h = 6;
        assertEquals(23, koko.getMinEatingSpeedBinarySearch(piles, h));
    }
}
