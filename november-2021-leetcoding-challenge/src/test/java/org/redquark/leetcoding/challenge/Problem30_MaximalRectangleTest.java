package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_MaximalRectangleTest {

    private final Problem30_MaximalRectangle testObject = new Problem30_MaximalRectangle();

    @Test
    void testMaximalRectangle() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(6, testObject.maximalRectangle(matrix));

        matrix = new char[][]{
                {'0', '1'},
                {'1', '0'}
        };
        assertEquals(1, testObject.maximalRectangle(matrix));

        matrix = new char[][]{
                {'0'}
        };
        assertEquals(0, testObject.maximalRectangle(matrix));
    }
}