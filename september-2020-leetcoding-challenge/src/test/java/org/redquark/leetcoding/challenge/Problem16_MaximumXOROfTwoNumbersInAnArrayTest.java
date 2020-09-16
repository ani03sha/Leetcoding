package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_MaximumXOROfTwoNumbersInAnArrayTest {

    private final Problem16_MaximumXOROfTwoNumbersInAnArray testObject =
            new Problem16_MaximumXOROfTwoNumbersInAnArray();

    @Test
    void testFindMaximumXOR() {
        int[] numbers = {3, 10, 5, 25, 2, 8};
        assertEquals(28, testObject.findMaximumXOR(numbers));
    }
}