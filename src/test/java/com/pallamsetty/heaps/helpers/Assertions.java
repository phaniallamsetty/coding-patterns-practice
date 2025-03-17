package com.pallamsetty.heaps.helpers;

import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.*;

public final class Assertions {
    public static void assertLists(List<Integer> expected, List<Integer> actual) {
        assertEquals(expected.size(), actual.size());

        for(int num: expected) {
            assertTrue(actual.contains(num));
        }
    }
}
