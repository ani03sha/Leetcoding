package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge12_LastStoneWeightTest {

    private Challenge12_LastStoneWeight testObject = new Challenge12_LastStoneWeight();

    @Test
    void lastStoneWeight() {
        int[] input = new int[]{2, 7, 4, 1, 8, 1};
        assertEquals(1, testObject.lastStoneWeight(input));
    }
}