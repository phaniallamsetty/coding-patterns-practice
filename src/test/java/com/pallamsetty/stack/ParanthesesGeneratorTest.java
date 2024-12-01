package com.pallamsetty.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParanthesesGeneratorTest {
    private final ParanthesesGenerator pg;

    public ParanthesesGeneratorTest() {
        pg = new ParanthesesGenerator();
    }

    @Test
    public void testGenerateParanthesesBruteForce1() {
        int n = 1;
        List<String> expected = new ArrayList<>();
        expected.add("()");
        List<String> actual = pg.generateParanthesesBruteForce(n);
        assertLists(expected, actual);
    }

    @Test
    public void testGenerateParanthesesBruteForce2() {
        int n = 3;
        List<String> expected = List.of(
                new String[]{ "((()))", "(()())", "(())()", "()(())", "()()()" });
        List<String> actual = pg.generateParanthesesBruteForce(n);
        assertLists(expected, actual);
    }

    @Test
    public void testGenerateParanthesesBacktracking1() {
        int n = 1;
        List<String> expected = new ArrayList<>();
        expected.add("()");
        List<String> actual = pg.generateParanthesesBacktracking(n);
        assertLists(expected, actual);
    }

    @Test
    public void testGenerateParanthesesBacktracking2() {
        int n = 3;
        List<String> expected = List.of(
                new String[]{ "((()))", "(()())", "(())()", "()(())", "()()()" });
        List<String> actual = pg.generateParanthesesBacktracking(n);
        assertLists(expected, actual);
    }

    private void assertLists(List<String> expected, List<String> actual) {
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected));
    }
}
