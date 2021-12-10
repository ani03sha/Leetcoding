package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_DominoAndTrominoTilingTest {

    private final Problem10_DominoAndTrominoTiling testObject = new Problem10_DominoAndTrominoTiling();

    @Test
    void testNumTilings() {
        assertEquals(5, testObject.numTilings(3));
        assertEquals(1, testObject.numTilings(1));
    }
}