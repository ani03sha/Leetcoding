package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_MaximumNumberOfKsumPairsTest {

    private final Problem18_MaximumNumberOfKsumPairs testObject =
            new Problem18_MaximumNumberOfKsumPairs();

    @Test
    void testMaxOperations() {
        assertEquals(2, testObject.maxOperations(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, testObject.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        assertEquals(4, testObject.maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3));
    }
}