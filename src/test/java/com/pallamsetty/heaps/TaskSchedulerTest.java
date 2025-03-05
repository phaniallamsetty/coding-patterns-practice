package com.pallamsetty.heaps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSchedulerTest {
    private final TaskScheduler ts;

    public TaskSchedulerTest() {
        ts = new TaskScheduler();
    }

    @Test
    public void testGetMinUnitsOfTime1() {
        char[] tasks = { 'X', 'X', 'Y', 'Y' };
        int n = 2;

        assertEquals(5, ts.getMinUnitsOfTime(tasks, n));
    }

    @Test
    public void testGetMinUnitsOfTime2() {
        char[] tasks = { 'A', 'A', 'A', 'B', 'C' };
        int n = 3;

        assertEquals(9, ts.getMinUnitsOfTime(tasks, n));
    }

    @Test
    public void testGetMinUnitsOfTime3() {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;

        assertEquals(8, ts.getMinUnitsOfTime(tasks, n));
    }

    @Test
    public void testGetMinUnitsOfTime4() {
        char[] tasks = { 'A', 'C', 'A', 'B', 'D', 'B' };
        int n = 1;

        assertEquals(6, ts.getMinUnitsOfTime(tasks, n));
    }

    @Test
    public void testGetMinUnitsOfTime5() {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 3;

        assertEquals(10, ts.getMinUnitsOfTime(tasks, n));
    }
}
