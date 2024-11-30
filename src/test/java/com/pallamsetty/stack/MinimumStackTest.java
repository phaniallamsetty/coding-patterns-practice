package com.pallamsetty.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumStackTest {
    private final MinimumStack ms;

    public MinimumStackTest() {
        ms = new MinimumStack();
    }

    @Test
    public void testExample1() {
        ms.push(-2);
        assertEquals(-2, ms.top());
    }

    @Test
    public void testExample2() {
        ms.push(-2);
        ms.push(0);
        assertEquals(0, ms.top());
        assertEquals(-2, ms.getMin());
    }

    @Test
    public void testExample3() {
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        assertEquals(-3, ms.top());
        assertEquals(-3, ms.getMin());
    }

    @Test
    public void testExample4() {
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        ms.pop();
        assertEquals(0, ms.top());
        assertEquals(-2, ms.getMin());
    }

    @Test
    public void testExample5() {
        ms.push(1);
        assertEquals(1, ms.top());
        assertEquals(1, ms.getMin());
    }

    @Test
    public void testExample6() {
        ms.push(1);
        ms.push(2);
        assertEquals(2, ms.top());
        assertEquals(1, ms.getMin());
    }

    @Test
    public void testExample7() {
        ms.push(1);
        ms.push(2);
        ms.push(0);
        assertEquals(0, ms.top());
        assertEquals(0, ms.getMin());
    }

    @Test
    public void testExample8() {
        ms.push(1);
        ms.push(2);
        ms.push(0);
        ms.pop();
        assertEquals(2, ms.top());
        assertEquals(1, ms.getMin());
    }
}
