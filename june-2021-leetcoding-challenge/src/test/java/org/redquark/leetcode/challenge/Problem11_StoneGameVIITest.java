package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_StoneGameVIITest {

    private final Problem11_StoneGameVII testObject = new Problem11_StoneGameVII();

    @Test
    void testStoneGameVII() {
        int[] stones = new int[]{5, 3, 1, 4, 2};
        assertEquals(6, testObject.stoneGameVII(stones));

        stones = new int[]{7, 90, 5, 1, 100, 10, 10, 2};
        assertEquals(122, testObject.stoneGameVII(stones));
    }
}