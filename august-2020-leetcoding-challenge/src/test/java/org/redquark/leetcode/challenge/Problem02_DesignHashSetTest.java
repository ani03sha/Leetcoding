package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem02_DesignHashSetTest {

    private final Problem02_DesignHashSet testObject = new Problem02_DesignHashSet();

    @BeforeEach
    void setUp() {
        testObject.add(1);
        testObject.add(2);
    }

    @Test
    void testAdd() {
        testObject.add(3);
        testObject.add(4);
        assertTrue(testObject.contains(2));
        assertFalse(testObject.contains(5));
    }

    @Test
    void testRemove() {
        testObject.remove(1);
        assertTrue(testObject.contains(2));
        testObject.remove(4);
        assertFalse(testObject.contains(4));
    }

    @Test
    void testContains() {
        assertTrue(testObject.contains(1));
        assertTrue(testObject.contains(2));
        assertFalse(testObject.contains(0));
    }
}