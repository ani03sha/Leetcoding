package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    private final Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts testObject =
            new Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();

    @Test
    void testMaxArea() {
        int h = 5;
        int w = 4;
        int[] horizontalCuts = new int[]{1, 2, 4};
        int[] verticalCuts = new int[]{1, 3};
        assertEquals(4, testObject.maxArea(h, w, horizontalCuts, verticalCuts));

        h = 5;
        w = 4;
        horizontalCuts = new int[]{3, 1};
        verticalCuts = new int[]{1};
        assertEquals(6, testObject.maxArea(h, w, horizontalCuts, verticalCuts));

        h = 5;
        w = 4;
        horizontalCuts = new int[]{3};
        verticalCuts = new int[]{3};
        assertEquals(9, testObject.maxArea(h, w, horizontalCuts, verticalCuts));
    }
}