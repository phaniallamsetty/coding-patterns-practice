package com.pallamsetty.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeMapTest {
    private final TimeMap tmap;

    public TimeMapTest() {
        tmap = new TimeMap();
    }

    @Test
    public void testTimeMap1() {
        tmap.set("alice", "happy", 1);
        assertEquals("happy", tmap.get("alice", 1));
        assertEquals("happy", tmap.get("alice", 2));
        tmap.set("alice", "sad", 3);
        assertEquals("sad", tmap.get("alice", 4));
        tmap.set("alice", "moderate", 6);
        tmap.set("alice", "angry", 9);
        assertEquals("moderate", tmap.get("alice", 8));
        assertEquals("angry", tmap.get("alice", 22));
    }

    @Test
    public void testTimeMap2() {
        tmap.set("foo", "bar", 1);
        assertEquals("bar", tmap.get("foo", 1));
        assertEquals("bar", tmap.get("foo", 3));
        tmap.set("foo", "bar2", 4);
        assertEquals("bar2", tmap.get("foo", 4));
        assertEquals("bar2", tmap.get("foo", 5));
        assertEquals("bar", tmap.get("foo", 3));
    }
}
