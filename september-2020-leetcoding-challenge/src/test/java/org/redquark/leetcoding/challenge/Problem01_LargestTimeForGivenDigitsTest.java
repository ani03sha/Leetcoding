package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_LargestTimeForGivenDigitsTest {

    private final Problem01_LargestTimeForGivenDigits testObject = new Problem01_LargestTimeForGivenDigits();

    @Test
    void testLargestTimeFromDigits() {
        int[] A = new int[]{1, 2, 3, 4};
        assertEquals("23:41", testObject.largestTimeFromDigits(A));

        A = new int[]{5, 5, 5, 5};
        assertEquals("", testObject.largestTimeFromDigits(A));
    }
}