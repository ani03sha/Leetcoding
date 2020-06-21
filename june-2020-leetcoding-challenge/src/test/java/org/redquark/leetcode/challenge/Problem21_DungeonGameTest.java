package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_DungeonGameTest {

    private final Problem21_DungeonGame testObject = new Problem21_DungeonGame();

    @Test
    void testCalculateMinimumHP() {
        int[][] dungeon = new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        assertEquals(7, testObject.calculateMinimumHP(dungeon));
    }
}