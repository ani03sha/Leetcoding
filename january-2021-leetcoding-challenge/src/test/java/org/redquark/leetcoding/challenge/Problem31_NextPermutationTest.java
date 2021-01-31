package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem31_NextPermutationTest {

    private final Problem31_NextPermutation testObject = new Problem31_NextPermutation();

    @Test
    void testNextPermutation() {
        int[] nums = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 3, 2};
        assertArrayEquals(expected, testObject.nextPermutation(nums));

        nums = new int[]{3, 2, 1};
        expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, testObject.nextPermutation(nums));

        nums = new int[]{1, 1, 5};
        expected = new int[]{1, 5, 1};
        assertArrayEquals(expected, testObject.nextPermutation(nums));

        nums = new int[]{1};
        expected = new int[]{1};
        assertArrayEquals(expected, testObject.nextPermutation(nums));
    }
}