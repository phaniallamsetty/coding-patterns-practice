package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramCheckerTest {
    private final AnagramChecker ac;

    public AnagramCheckerTest() {
        ac = new AnagramChecker();
    }

    @Test
    public void testIsAnagram1() {
        assertTrue(ac.isAnagram("racecar", "carrace"));
    }

    @Test
    public void testIsAnagram2() {
        assertFalse(ac.isAnagram("jar", "jam"));
    }

    @Test
    public void testIsAnagram3() {
        assertTrue(ac.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testIsAnagram4() {
        assertFalse(ac.isAnagram("rat", "car"));
    }
}
