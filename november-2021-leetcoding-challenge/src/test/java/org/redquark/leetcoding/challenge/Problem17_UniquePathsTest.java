package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_UniquePathsTest {

    private final Problem17_UniquePaths testObject = new Problem17_UniquePaths();

    @Test
    void testUniquePaths() {
        assertEquals(28, testObject.uniquePaths(3, 7));
        assertEquals(3, testObject.uniquePaths(3, 2));
        assertEquals(28, testObject.uniquePaths(7, 3));
        assertEquals(6, testObject.uniquePaths(3, 3));
    }
}