package com.pallamsetty.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DailyTemperaturesTest {
    private final DailyTemperatures dt;

    public DailyTemperaturesTest() {
        dt = new DailyTemperatures();
    }

    @Test
    public void testGetNextTemperatureInDays1() {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] expected = { 1, 1, 4, 2, 1, 1, 0, 0 };
        int[] actual = dt.getNextWarmTemperatureInDays(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetNextTemperatureInDays2() {
        int[] temperatures = { 30,40,50,60 };
        int[] expected = { 1, 1, 1, 0 };
        int[] actual = dt.getNextWarmTemperatureInDays(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetNextTemperatureInDays3() {
        int[] temperatures = { 30, 60, 90 };
        int[] expected = { 1, 1, 0 };
        int[] actual = dt.getNextWarmTemperatureInDays(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetNextTemperatureInDays4() {
        int[] temperatures = { 30, 38, 30, 36, 35, 40, 28 };
        int[] expected = { 1, 4, 1, 2, 1, 0, 0 };
        int[] actual = dt.getNextWarmTemperatureInDays(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetNextTemperatureInDays5() {
        int[] temperatures = { 22, 21, 20 };
        int[] expected = { 0, 0, 0 };
        int[] actual = dt.getNextWarmTemperatureInDays(temperatures);
        assertArrayEquals(expected, actual);
    }
}
