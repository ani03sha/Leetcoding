package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem05_MergeTwoSortedArraysTest {

    private final Problem05_MergeTwoSortedArrays testObject = new Problem05_MergeTwoSortedArrays();

    @Test
    void testMerge() {
        int[] numbers1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] numbers2 = new int[]{2, 5, 6};
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        Assertions.assertArrayEquals(expected, testObject.merge(numbers1, 3, numbers2, 3));
    }
}