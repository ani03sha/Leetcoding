package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_3SumTest {

    private final Problem08_3Sum testObject = new Problem08_3Sum();

    @Test
    void testThreeSum() {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected, testObject.threeSum(numbers));

        numbers = new int[]{-2, 0, 1, 1, 2};
        expected.clear();
        expected.add(Arrays.asList(-2, 0, 2));
        expected.add(Arrays.asList(-2, 1, 1));
        assertEquals(expected, testObject.threeSum(numbers));
    }
}