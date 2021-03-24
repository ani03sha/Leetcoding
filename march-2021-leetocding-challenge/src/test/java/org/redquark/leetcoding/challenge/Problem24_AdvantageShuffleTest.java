package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem24_AdvantageShuffleTest {

    private final Problem24_AdvantageShuffle testObject = new Problem24_AdvantageShuffle();

    @Test
    void testAdvantageCount() {
        int[] A = new int[]{2, 7, 11, 15};
        int[] B = new int[]{1, 10, 4, 11};
        int[] expected = new int[]{2, 11, 7, 15};
        assertArrayEquals(expected, testObject.advantageCount(A, B));

        A = new int[]{12, 24, 8, 32};
        B = new int[]{13, 25, 32, 11};
        expected = new int[]{24, 32, 8, 12};
        assertArrayEquals(expected, testObject.advantageCount(A, B));
    }
}