package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem06_QueueReconstructionByHeightTest {

    private final Problem06_QueueReconstructionByHeight testObject = new Problem06_QueueReconstructionByHeight();

    @Test
    void testReconstructQueue() {
        int[][] people = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] expected = new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertArrayEquals(expected, testObject.reconstructQueue(people));
    }
}