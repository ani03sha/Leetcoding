package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_RangeAdditionIITest {

    private final Problem30_RangeAdditionII testObject = new Problem30_RangeAdditionII();

    @Test
    void testMaxCount() {
        int m = 3;
        int n = 3;
        int[][] ops = new int[][]{
                {2, 2},
                {3, 3}
        };
        assertEquals(4, testObject.maxCount(m, n, ops));

        ops = new int[][]{
                {2, 2},
                {3, 3},
                {3, 3},
                {3, 3},
                {2, 2},
                {3, 3},
                {3, 3},
                {3, 3},
                {2, 2},
                {3, 3},
                {3, 3},
                {3, 3}
        };
        assertEquals(4, testObject.maxCount(m, n, ops));

        ops = new int[][]{};
        assertEquals(9, testObject.maxCount(m, n, ops));
    }
}