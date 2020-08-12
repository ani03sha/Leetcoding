package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_PascalTriangleIITest {

    private final Problem12_PascalTriangleII testObject = new Problem12_PascalTriangleII();

    @Test
    void testGetRow() {
        List<Integer> expected = Arrays.asList(1, 2, 1);
        assertEquals(expected, testObject.getRow(2));
        expected = Arrays.asList(1, 4, 6, 4, 1);
        assertEquals(expected, testObject.getRow(4));
        expected = Collections.singletonList(1);
        assertEquals(expected, testObject.getRow(0));
    }
}