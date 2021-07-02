package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_FindKClosestElementsTest {

    private final Problem02_FindKClosestElements testObject = new Problem02_FindKClosestElements();

    @Test
    void testFindClosestElements() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, testObject.findClosestElements(nums, k, x));

        nums = new int[]{1, 2, 3, 4, 5};
        k = 4;
        x = -1;
        expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, testObject.findClosestElements(nums, k, x));
    }
}