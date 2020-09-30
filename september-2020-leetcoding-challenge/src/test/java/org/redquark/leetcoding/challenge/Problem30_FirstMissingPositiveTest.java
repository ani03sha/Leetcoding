package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_FirstMissingPositiveTest {

    private final Problem30_FirstMissingPositive testObject = new Problem30_FirstMissingPositive();

    @Test
    void testFirstMissingPositive() {
        int[] numbers = new int[]{1, 2, 0};
        assertEquals(3, testObject.firstMissingPositive(numbers));

        numbers = new int[]{3, 4, -1, 1};
        assertEquals(2, testObject.firstMissingPositive(numbers));

        numbers = new int[]{7, 8, 9, 11, 12};
        assertEquals(1, testObject.firstMissingPositive(numbers));
    }
}