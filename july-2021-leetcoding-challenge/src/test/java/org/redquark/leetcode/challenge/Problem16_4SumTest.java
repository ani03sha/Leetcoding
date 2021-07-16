package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_4SumTest {

    private final Problem16_4Sum testObject = new Problem16_4Sum();

    @Test
    void testFourSum() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-1, 0, 0, 1));
        assertEquals(expected, testObject.fourSum(nums, target));

        nums = new int[]{2, 2, 2, 2, 2};
        target = 8;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2));
        assertEquals(expected, testObject.fourSum(nums, target));
    }
}