package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem10_FlippingAnImageTest {

    private final Problem10_FlippingAnImage testObject = new Problem10_FlippingAnImage();

    @Test
    void testFlipAndInvertImage() {
        int[][] A = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] expected = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        assertArrayEquals(expected, testObject.flipAndInvertImage(A));

        A = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        expected = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        assertArrayEquals(expected, testObject.flipAndInvertImage(A));
    }
}