package com.pallamsetty.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarFleetTest {
    private final CarFleet cf;

    public CarFleetTest() {
        cf = new CarFleet();
    }

    @Test
    public void testGetNumFleets1() {
        int target = 12;
        int[] position = { 10, 8, 0, 5, 3 };
        int[] speed = { 2, 4, 1, 1, 3 };
        assertEquals(3, cf.getNumFleets(target, position, speed));
    }

    @Test
    public void testGetNumFleets2() {
        int target = 10;
        int[] position = { 3 };
        int[] speed = { 3 };
        assertEquals(1, cf.getNumFleets(target, position, speed));
    }

    @Test
    public void testGetNumFleets3() {
        int target = 100;
        int[] position = { 0, 2, 4 };
        int[] speed = { 4, 2, 1 };
        assertEquals(1, cf.getNumFleets(target, position, speed));
    }

    @Test
    public void testGetNumFleets4() {
        int target = 10;
        int[] position = { 1, 4 };
        int[] speed = { 3, 2 };
        assertEquals(1, cf.getNumFleets(target, position, speed));
    }

    @Test
    public void testGetNumFleets5() {
        int target = 10;
        int[] position = { 4, 1, 0, 7 };
        int[] speed = { 2, 2, 1, 1 };
        assertEquals(3, cf.getNumFleets(target, position, speed));
    }
}
