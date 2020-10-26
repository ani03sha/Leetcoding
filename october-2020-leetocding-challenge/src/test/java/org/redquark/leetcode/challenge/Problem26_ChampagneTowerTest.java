package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_ChampagneTowerTest {

    private final Problem26_ChampagneTower testObject = new Problem26_ChampagneTower();

    @Test
    void testChampagneTower() {
        assertEquals(0.0, testObject.champagneTower(1, 1, 1));
        assertEquals(0.5, testObject.champagneTower(2, 1, 1));
        assertEquals(1.00000, testObject.champagneTower(100000009, 33, 17));
    }
}