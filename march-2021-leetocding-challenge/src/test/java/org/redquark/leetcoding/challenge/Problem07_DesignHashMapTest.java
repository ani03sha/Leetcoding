package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem07_DesignHashMap.MyHashMap;

class Problem07_DesignHashMapTest {

    private final MyHashMap testObject = new MyHashMap();

    @Test
    void test() {
        testObject.put(1, 1);
        testObject.put(2, 2);
        assertEquals(1, testObject.get(1));
        assertEquals(2, testObject.get(2));
        assertEquals(-1, testObject.get(3));
        testObject.put(2, 1);
        assertEquals(1, testObject.get(2));
        testObject.remove(2);
        assertEquals(-1, testObject.get(2));
    }
}