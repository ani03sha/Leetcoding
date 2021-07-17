package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_ThreeEqualPartsTest {

    private final Problem17_ThreeEqualParts testObject = new Problem17_ThreeEqualParts();

    @Test
    void testThreeEqualParts() {
        int[] nums = new int[]{1, 0, 1, 0, 1};
        int[] expected = new int[]{0, 3};
        assertArrayEquals(expected, testObject.threeEqualParts(nums));

        nums = new int[]{1, 1, 0, 1, 1};
        expected = new int[]{-1, -1};
        assertArrayEquals(expected, testObject.threeEqualParts(nums));

        nums = new int[]{1, 1, 0, 0, 1};
        expected = new int[]{0, 2};
        assertArrayEquals(expected, testObject.threeEqualParts(nums));
    }
}