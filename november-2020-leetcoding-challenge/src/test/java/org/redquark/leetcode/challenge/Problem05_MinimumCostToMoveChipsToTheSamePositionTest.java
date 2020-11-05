package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_MinimumCostToMoveChipsToTheSamePositionTest {

    private final Problem05_MinimumCostToMoveChipsToTheSamePosition testObject =
            new Problem05_MinimumCostToMoveChipsToTheSamePosition();

    @Test
    void testMinCostToMoveChips() {
        assertEquals(2, testObject.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
        assertEquals(1, testObject.minCostToMoveChips(new int[]{1, 2, 3}));
        assertEquals(1, testObject.minCostToMoveChips(new int[]{1, 1000000000}));
    }
}