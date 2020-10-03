package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_KDiffPairsInAnArrayTest {

    private final Problem03_KDiffPairsInAnArray testObject = new Problem03_KDiffPairsInAnArray();

    @Test
    void testFindPairs() {
        int[] numbers = new int[]{3, 1, 4, 1, 5};
        int k = 2;
        assertEquals(2, testObject.findPairs(numbers, k));

        numbers = new int[]{1, 2, 3, 4, 5};
        k = 1;
        assertEquals(4, testObject.findPairs(numbers, k));

        numbers = new int[]{1, 3, 1, 5, 4};
        k = 0;
        assertEquals(1, testObject.findPairs(numbers, k));

        numbers = new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3};
        k = 3;
        assertEquals(2, testObject.findPairs(numbers, k));

        numbers = new int[]{-1, -2, -3};
        k = 1;
        assertEquals(2, testObject.findPairs(numbers, k));
    }
}