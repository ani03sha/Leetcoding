package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Problem22_RandomPointInNonOverlappingRectanglesTest {

    @Test
    void testPick() {
        int[][] rectangles = {{-2, -2, -1, -1}, {1, 0, 3, 0}};
        Problem22_RandomPointInNonOverlappingRectangles testObject = new Problem22_RandomPointInNonOverlappingRectangles(rectangles);
        System.out.println(Arrays.toString(testObject.pick()));
    }
}