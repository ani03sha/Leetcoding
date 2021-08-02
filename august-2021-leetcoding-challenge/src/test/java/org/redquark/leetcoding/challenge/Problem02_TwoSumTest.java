package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem02_TwoSumTest {

    private final Problem02_TwoSum testObject = new Problem02_TwoSum();

    @Test
    void testTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, testObject.twoSum(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.twoSum(nums, target));

        nums = new int[]{3, 3};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, testObject.twoSum(nums, target));
    }
}