package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem12_RandomizedSetTest {

    private final Problem12_RandomizedSet testObject = new Problem12_RandomizedSet();

    @Test
    void test() {
        assertTrue(testObject.insert(1));
        assertFalse(testObject.remove(2));
        assertEquals(1, testObject.getRandom());
    }

}