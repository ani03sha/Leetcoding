package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_PascalsTriangleTest {

    private final Problem21_PascalsTriangle testObject = new Problem21_PascalsTriangle();

    @Test
    void testGenerate() {
        int rows = 5;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(expected, testObject.generate(rows));

        rows = 1;
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        assertEquals(expected, testObject.generate(rows));
    }
}