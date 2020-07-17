package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_ToKFrequentElementsTest {

    private final Problem17_ToKFrequentElements testObject = new Problem17_ToKFrequentElements();

    @Test
    void testTopKFrequent() {
        int[] numbers = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.topKFrequent(numbers, k));

        numbers = new int[]{1};
        k = 1;
        expected = new int[]{1};
        assertArrayEquals(expected, testObject.topKFrequent(numbers, k));
    }
}