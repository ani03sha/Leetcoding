package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_NQueensIITest {

    private final Problem29_NQueensII testObject1 = new Problem29_NQueensII();
    private final Problem29_NQueensII testObject2 = new Problem29_NQueensII();

    @Test
    void testTotalNQueens() {
        assertEquals(2, testObject1.totalNQueens(4));
        assertEquals(1, testObject2.totalNQueens(1));
    }
}