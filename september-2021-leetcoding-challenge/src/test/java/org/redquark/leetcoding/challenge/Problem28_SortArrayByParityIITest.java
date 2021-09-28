package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_SortArrayByParityIITest {

    private final Problem28_SortArrayByParityII testObject = new Problem28_SortArrayByParityII();

    @Test
    void testSortArrayByParityII() {
        int[] nums = new int[]{4, 2, 5, 7};
        int[] expected = new int[]{4, 5, 2, 7};
        assertArrayEquals(expected, testObject.sortArrayByParityII(nums));

        nums = new int[]{2, 3};
        expected = new int[]{2, 3};
        assertArrayEquals(expected, testObject.sortArrayByParityII(nums));
    }
}