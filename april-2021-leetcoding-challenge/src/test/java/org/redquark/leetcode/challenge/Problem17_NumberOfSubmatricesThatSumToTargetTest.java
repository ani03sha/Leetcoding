package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_NumberOfSubmatricesThatSumToTargetTest {

    private final Problem17_NumberOfSubmatricesThatSumToTarget testObject =
            new Problem17_NumberOfSubmatricesThatSumToTarget();

    @Test
    void testNumSubmatrixSumTarget() {
        int[][] matrix = new int[][]{
                {0, 1, 0}, {1, 1, 1}, {0, 1, 0}
        };
        int target = 0;
        assertEquals(4, testObject.numSubmatrixSumTarget(matrix, target));

        matrix = new int[][]{
                {1, -1}, {-1, 1}
        };
        target = 0;
        assertEquals(5, testObject.numSubmatrixSumTarget(matrix, target));

        matrix = new int[][]{{904}};
        target = 0;
        assertEquals(0, testObject.numSubmatrixSumTarget(matrix, target));
    }
}