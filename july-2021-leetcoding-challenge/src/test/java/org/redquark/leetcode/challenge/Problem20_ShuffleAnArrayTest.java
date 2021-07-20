package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Problem20_ShuffleAnArrayTest {

    @Test
    void test() {
        int[] nums = {1, 2, 3};
        Problem20_ShuffleAnArray testObject = new Problem20_ShuffleAnArray(nums);
        assertNotNull(testObject.shuffle());
        assertArrayEquals(nums, testObject.reset());
    }
}