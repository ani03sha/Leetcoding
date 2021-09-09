package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_LargestPlusSignTest {

    private final Problem09_LargestPlusSign testObject = new Problem09_LargestPlusSign();

    @Test
    void testOrderOfLargestPlusSign() {
        int n = 5;
        int[][] mines = new int[][]{{4, 2}};
        assertEquals(2, testObject.orderOfLargestPlusSign(n, mines));

        n = 1;
        mines = new int[][]{{0, 0}};
        assertEquals(0, testObject.orderOfLargestPlusSign(n, mines));
    }
}