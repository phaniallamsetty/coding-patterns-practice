package com.pallamsetty.heaps;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HeapTest {
    private final Heap h;

    public HeapTest() {
        h = new Heap();
    }

    @Test
    public void testHeapImpl1() {
        h.push(30);
        h.push(16);

        Integer[] expected = { 0, 16, 30 };
        Object[] actualList = h.heap.toArray();
        Integer[] actual = Arrays.copyOf(actualList, actualList.length, Integer[].class);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testHeapImpl2() {
        h.push(14);
        h.push(19);
        h.push(16);
        h.push(21);
        h.push(26);
        h.push(19);
        h.push(68);
        h.push(65);
        h.push(30);

        Integer[] expected = { 0, 14, 19, 16, 21, 26, 19, 68, 65, 30 };
        Object[] actualList = h.heap.toArray();
        Integer[] actual = Arrays.copyOf(actualList, actualList.length, Integer[].class);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testHeapImpl3() {
        h.push(14);
        h.push(19);
        h.push(16);
        h.push(21);
        h.push(26);
        h.push(19);
        h.push(68);
        h.push(65);
        h.push(30);

        Integer[] expected = { 0, 14, 19, 16, 21, 26, 19, 68, 65, 30 };
        Object[] actualList = h.heap.toArray();
        Integer[] actual = Arrays.copyOf(actualList, actualList.length, Integer[].class);

        assertArrayEquals(expected, actual);

        h.push(17);

        assertEquals(17, h.heap.get(2) != null ? h.heap.get(2) : Integer.MIN_VALUE);
    }

    @Test
    public void testHeapImpl4() {
        h.push(14);
        h.push(19);
        h.push(16);
        h.push(21);
        h.push(26);
        h.push(19);
        h.push(68);
        h.push(65);
        h.push(30);

        Integer[] expected = { 0, 14, 19, 16, 21, 26, 19, 68, 65, 30 };
        Object[] actualList = h.heap.toArray();
        Integer[] actual = Arrays.copyOf(actualList, actualList.length, Integer[].class);

        assertArrayEquals(expected, actual);

        h.pop();
        assertEquals(16, (int) h.heap.get(1));
        assertEquals(19, (int) h.heap.get(3));
        assertEquals(30, (int) h.heap.get(6));
    }
}
