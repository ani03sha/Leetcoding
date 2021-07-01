package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_GrayCodeTest {

    private final Problem01_GrayCode testObject = new Problem01_GrayCode();

    @Test
    void testGrayCode() {
        int n = 2;
        List<Integer> expected = Arrays.asList(0, 1, 3, 2);
        assertEquals(expected, testObject.grayCode(n));

        n = 1;
        expected = Arrays.asList(0, 1);
        assertEquals(expected, testObject.grayCode(n));
    }
}