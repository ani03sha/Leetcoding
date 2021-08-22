package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_RectangleAreaIITest {

    private final Problem22_RectangleAreaII testObject = new Problem22_RectangleAreaII();

    @Test
    void testRectangleArea() {
        int[][] rectangles = new int[][]{
                {0, 0, 2, 2},
                {1, 0, 2, 3},
                {1, 0, 3, 1}
        };
        assertEquals(6, testObject.rectangleArea(rectangles));

        rectangles = new int[][]{
                {0, 0, 1000000000, 1000000000}
        };
        assertEquals(49, testObject.rectangleArea(rectangles));
    }
}