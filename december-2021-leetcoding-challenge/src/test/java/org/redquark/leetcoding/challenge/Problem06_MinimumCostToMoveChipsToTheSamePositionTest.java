package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_MinimumCostToMoveChipsToTheSamePositionTest {

    private final Problem06_MinimumCostToMoveChipsToTheSamePosition testObject =
            new Problem06_MinimumCostToMoveChipsToTheSamePosition();

    @Test
    void testMinCostToMoveChips() {
        int[] position = new int[]{1, 2, 3};
        assertEquals(1, testObject.minCostToMoveChips(position));

        position = new int[]{2, 2, 2, 3, 3};
        assertEquals(2, testObject.minCostToMoveChips(position));

        position = new int[]{1, 1000000000};
        assertEquals(1, testObject.minCostToMoveChips(position));
    }
}