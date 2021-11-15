package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_LargestDivisibleSubsetTest {

    private final Problem15_LargestDivisibleSubset testObject = new Problem15_LargestDivisibleSubset();

    @Test
    void testLargestDivisibleSubset() {
        int[] nums = new int[]{1, 2, 3};
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, testObject.largestDivisibleSubset(nums));

        nums = new int[]{1, 2, 4, 8};
        expected = Arrays.asList(1, 2, 4, 8);
        assertEquals(expected, testObject.largestDivisibleSubset(nums));
    }
}