package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Challenge24_LRUCache.LRUCache;

class Challenge24_LRUCacheTest {

    private static Challenge24_LRUCache.LRUCache testObject;

    @BeforeEach
    public void setUp() {
        testObject = new LRUCache(2);
        testObject.put(1, 1);
        testObject.put(2, 2);
    }

    @Test
    public void testGet() {
        assertEquals(-1, testObject.get(3));
        assertEquals(1, testObject.get(1));
        assertEquals(2, testObject.get(2));
    }

    @Test
    public void testPut() {
        testObject.put(3, 3);
        assertEquals(3, testObject.get(3));
        testObject.put(4, 4);
        assertEquals(4, testObject.get(4));
        assertEquals(-1, testObject.get(1));
    }
}