package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_SubsetsTest {

    private final Problem11_Subsets testObject = new Problem11_Subsets();

    @Test
    void testSubsets() {
        int[] numbers = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Collections.singletonList(3));
        assertEquals(expected, testObject.subsets(numbers));
    }
}