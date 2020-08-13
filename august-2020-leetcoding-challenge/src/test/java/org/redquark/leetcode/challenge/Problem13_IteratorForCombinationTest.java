package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem13_IteratorForCombinationTest {

    @Test
    void test() {
        Problem13_IteratorForCombination testObject = new Problem13_IteratorForCombination("abc", 2);
        assertEquals("ab", testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals("ac", testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals("bc", testObject.next());
        assertFalse(testObject.hasNext());
    }
}