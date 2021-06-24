package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_OutOfBoundaryPathsTest {

    private final Problem24_OutOfBoundaryPaths testObject = new Problem24_OutOfBoundaryPaths();

    @Test
    void testFindPaths() {
        int m = 2;
        int n = 2;
        int maxMove = 2;
        int startRow = 0;
        int startColumn = 0;
        assertEquals(6, testObject.findPaths(m, n, maxMove, startRow, startColumn));

        m = 1;
        n = 3;
        maxMove = 3;
        startRow = 0;
        startColumn = 1;
        assertEquals(12, testObject.findPaths(m, n, maxMove, startRow, startColumn));
    }
}