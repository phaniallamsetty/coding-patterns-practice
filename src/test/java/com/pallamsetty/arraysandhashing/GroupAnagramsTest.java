package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroupAnagramsTest {
    private final GroupAnagrams ga;

    public GroupAnagramsTest() {
        ga = new GroupAnagrams();
    }

    @Test
    public void testGroupAnagrams1() {
        String[] strs = { "eat","tea","tan","ate","nat","bat" };
        List<List<String>> expected = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("ate");
        current.add("eat");
        current.add("tea");
        expected.add(current);
        current = new ArrayList<>();
        current.add("bat");
        expected.add(current);
        current = new ArrayList<>();
        current.add("nat");
        current.add("tan");
        expected.add(current);
        List<List<String>> actual = ga.groupAnagrams(strs);

        assertLists(expected, actual);
    }

    @Test
    public void testGroupAnagrams2() {
        String[] strs = { "" };
        List<List<String>> expected = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("");
        expected.add(current);
        List<List<String>> actual = ga.groupAnagrams(strs);

        assertLists(expected, actual);
    }

    @Test
    public void testGroupAnagrams3() {
        String[] strs = { "a" };
        List<List<String>> expected = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("a");
        expected.add(current);
        List<List<String>> actual = ga.groupAnagrams(strs);

        assertLists(expected, actual);
    }

    @Test
    public void testGraoupAnagramsWithoutSorting1() {
        String[] strs = { "eat","tea","tan","ate","nat","bat" };
        List<List<String>> expected = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("ate");
        current.add("eat");
        current.add("tea");
        expected.add(current);
        current = new ArrayList<>();
        current.add("bat");
        expected.add(current);
        current = new ArrayList<>();
        current.add("nat");
        current.add("tan");
        expected.add(current);
        List<List<String>> actual = ga.groupAnagramsWithoutSorting(strs);

        assertLists(expected, actual);
    }

    @Test
    public void testGroupAnagramsWithoutSorting2() {
        String[] strs = { "" };
        List<List<String>> expected = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("");
        expected.add(current);
        List<List<String>> actual = ga.groupAnagramsWithoutSorting(strs);

        assertLists(expected, actual);
    }

    @Test
    public void testGroupAnagramsWithoutSorting3() {
        String[] strs = { "a" };
        List<List<String>> expected = new ArrayList<>();
        List<String> current = new ArrayList<>();
        current.add("a");
        expected.add(current);
        List<List<String>> actual = ga.groupAnagramsWithoutSorting(strs);

        assertLists(expected, actual);
    }

    private void assertLists(List<List<String>> expected, List<List<String>> actual) {
        assertEquals(expected.size(), actual.size());
        HashSet<List<String>> expectedhashSet = new HashSet<>();

        for(List<String> group: expected) {
            Collections.sort(group);
            expectedhashSet.add(group);
        }

        for(List<String> group: actual) {
            Collections.sort(group);
            assertTrue(expectedhashSet.contains(group));
        }
    }
}
