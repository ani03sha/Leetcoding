package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem06_SingleNumberIIITest {

    private final Problem06_SingleNumberIII testObject = new Problem06_SingleNumberIII();

    @Test
    void testSingleNumber() {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] expected = new int[]{5, 3};
        assertArrayEquals(expected, testObject.singleNumber(nums));

        nums = new int[]{-1, 0};
        expected = new int[]{0, -1};
        assertArrayEquals(expected, testObject.singleNumber(nums));
    }
}