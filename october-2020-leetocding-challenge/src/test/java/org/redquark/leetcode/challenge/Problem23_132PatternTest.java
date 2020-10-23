package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem23_132PatternTest {

    private final Problem23_132Pattern testObject = new Problem23_132Pattern();

    @Test
    void testFind132pattern() {
        assertFalse(testObject.find132pattern(new int[]{1, 2, 3, 4}));
        assertTrue(testObject.find132pattern(new int[]{3, 1, 4, 2}));
        assertTrue(testObject.find132pattern(new int[]{-1, 3, 2, 0}));
        assertFalse(testObject.find132pattern(new int[]{1, 0, 1, -4, -3}));
        assertTrue(testObject.find132pattern(new int[]{3, 5, 0, 3, 4}));
    }
}