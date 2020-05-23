package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_FloodFillTest {

    private final Problem11_FloodFill testObject = new Problem11_FloodFill();

    @Test
    void testFloodFill() {
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] expected = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        assertArrayEquals(expected, testObject.floodFill(image, sr, sc, newColor));
    }
}