package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_UniquePathsTest {

    private final Problem29_UniquePaths testObject = new Problem29_UniquePaths();

    @Test
    void testUniquePaths() {
        assertEquals(3, testObject.uniquePaths(3, 2));
        assertEquals(28, testObject.uniquePaths(7, 3));
        assertEquals(193536720, testObject.uniquePaths(23, 12));
    }
}