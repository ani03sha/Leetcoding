package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_MinimumAbsoluteDifferenceTest {

    private final Problem20_MinimumAbsoluteDifference testObject = new Problem20_MinimumAbsoluteDifference();

    @Test
    void testMinimumAbsDifference() {
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3, 4));
        assertEquals(expected, testObject.minimumAbsDifference(arr));

        arr = new int[]{1, 3, 6, 10, 15};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 3));
        assertEquals(expected, testObject.minimumAbsDifference(arr));
    }
}