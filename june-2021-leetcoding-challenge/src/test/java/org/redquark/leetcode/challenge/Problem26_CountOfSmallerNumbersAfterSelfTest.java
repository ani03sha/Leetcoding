package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_CountOfSmallerNumbersAfterSelfTest {

    private final Problem26_CountOfSmallerNumbersAfterSelf testObject = new Problem26_CountOfSmallerNumbersAfterSelf();

    @Test
    void testCountSmaller() {
        int[] nums = new int[]{5, 2, 6, 1};
        List<Integer> expected = Arrays.asList(2, 1, 1, 0);
        assertEquals(expected, testObject.countSmaller(nums));

        nums = new int[]{-1};
        expected = Collections.singletonList(0);
        assertEquals(expected, testObject.countSmaller(nums));

        nums = new int[]{-1, -1};
        expected = Arrays.asList(0, 0);
        assertEquals(expected, testObject.countSmaller(nums));
    }
}