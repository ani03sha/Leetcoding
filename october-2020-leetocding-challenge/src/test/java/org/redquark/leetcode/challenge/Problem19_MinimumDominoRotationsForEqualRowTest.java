package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_MinimumDominoRotationsForEqualRowTest {

    private final Problem19_MinimumDominoRotationsForEqualRow testObject =
            new Problem19_MinimumDominoRotationsForEqualRow();

    @Test
    void testMinDominoRotations() {
        int[] A = new int[]{2, 1, 2, 4, 2, 2};
        int[] B = new int[]{5, 2, 6, 2, 3, 2};
        assertEquals(2, testObject.minDominoRotations(A, B));

        A = new int[]{3, 5, 1, 2, 3};
        B = new int[]{3, 6, 3, 3, 4};
        assertEquals(-1, testObject.minDominoRotations(A, B));

        A = new int[]{1, 2, 1, 1, 1, 2, 2, 2};
        B = new int[]{2, 1, 2, 2, 2, 2, 2, 2};
        assertEquals(1, testObject.minDominoRotations(A, B));
    }
}