package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_FindTheTownJudgeTest {

    private final Problem10_FindTheTownJudge testObject = new Problem10_FindTheTownJudge();

    @Test
    void testFindJudge() {
        int[][] trust = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int N = 4;
        assertEquals(3, testObject.findJudge(N, trust));

        trust = new int[][]{{1, 2}, {2, 3}};
        N = 3;
        assertEquals(-1, testObject.findJudge(N, trust));
    }
}