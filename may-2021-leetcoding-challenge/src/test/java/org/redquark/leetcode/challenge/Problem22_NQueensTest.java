package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_NQueensTest {

    private final Problem22_NQueens testObject = new Problem22_NQueens();

    @Test
    void testSolveNQueens() {
        int n = 4;
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        assertEquals(expected, testObject.solveNQueens(n));

        n = 1;
        expected = new ArrayList<>();
        expected.add(Collections.singletonList("Q"));
        assertEquals(expected, testObject.solveNQueens(n));
    }
}