package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_LargestDivisibleSubsetTest {

    private final Problem13_LargestDivisibleSubset testObject = new Problem13_LargestDivisibleSubset();

    @Test
    void testLargestDivisibleSubset() {
        int[] numbers = new int[]{1, 2, 3};
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, testObject.largestDivisibleSubset(numbers));

        numbers = new int[]{1, 2, 4, 8};
        expected = Arrays.asList(1, 2, 4, 8);
        assertEquals(expected, testObject.largestDivisibleSubset(numbers));
    }
}