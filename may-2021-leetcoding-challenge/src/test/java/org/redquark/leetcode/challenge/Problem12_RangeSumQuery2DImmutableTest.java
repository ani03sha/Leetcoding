package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem12_RangeSumQuery2DImmutable.NumMatrix;

class Problem12_RangeSumQuery2DImmutableTest {

    @Test
    void test() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix testObject = new NumMatrix(matrix);
        int a = 2;
        int b = 1;
        int c = 4;
        int d = 3;
        assertEquals(8, testObject.sumRegion(a, b, c, d));

        a = 1;
        b = 1;
        c = 2;
        d = 2;
        assertEquals(11, testObject.sumRegion(a, b, c, d));

        a = 1;
        b = 2;
        c = 2;
        d = 4;
        assertEquals(12, testObject.sumRegion(a, b, c, d));
    }

}