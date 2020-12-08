package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    private final Problem08_PairsOfSongsWithTotalDurationsDivisibleBy60 testObject =
            new Problem08_PairsOfSongsWithTotalDurationsDivisibleBy60();

    @Test
    void testNumPairsDivisibleBy60() {
        int[] time = new int[]{30, 20, 150, 100, 40};
        assertEquals(3, testObject.numPairsDivisibleBy60(time));

        time = new int[]{60, 60, 60};
        assertEquals(3, testObject.numPairsDivisibleBy60(time));
    }
}