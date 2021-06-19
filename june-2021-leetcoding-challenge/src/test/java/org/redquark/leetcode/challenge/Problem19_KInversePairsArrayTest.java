package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_KInversePairsArrayTest {

    private final Problem19_KInversePairsArray testObject = new Problem19_KInversePairsArray();

    @Test
    void testKInversePairs() {
        int n = 3;
        int k = 0;
        assertEquals(1, testObject.kInversePairs(n, k));

        n = 3;
        k = 1;
        assertEquals(2, testObject.kInversePairs(n, k));
    }
}