package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_RandomPickWithWeightTest {

    @Test
    void pickIndex() {
        int[] w = new int[]{1, 3};
        Problem05_RandomPickWithWeight testObject = new Problem05_RandomPickWithWeight(w);
        assertEquals(1, testObject.pickIndex());
        assertEquals(1, testObject.pickIndex());
    }
}