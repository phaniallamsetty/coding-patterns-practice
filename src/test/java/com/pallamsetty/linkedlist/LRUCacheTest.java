package com.pallamsetty.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {
    private LRUCache lru;

    @Test
    public void lruCacheTest1() {
        lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        assertEquals(1, lru.get(1));
        lru.put(3, 3);
        assertEquals(-1, lru.get(2));
        lru.put(4, 4);
        assertEquals(-1, lru.get(1));
        assertEquals(3, lru.get(3));
        assertEquals(4, lru.get(4));
    }
}
