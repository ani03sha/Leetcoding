package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem21_FindTheMostCompetitiveSubsequenceTest {

    private final Problem21_FindTheMostCompetitiveSubsequence testObject =
            new Problem21_FindTheMostCompetitiveSubsequence();

    @Test
    void testMostCompetitive() {
        int[] nums = new int[]{3, 5, 2, 6};
        int k = 2;
        int[] expected = new int[]{2, 6};
        assertArrayEquals(expected, testObject.mostCompetitive(nums, k));

        nums = new int[]{2, 4, 3, 3, 5, 4, 9, 6};
        k = 4;
        expected = new int[]{2, 3, 3, 4};
        assertArrayEquals(expected, testObject.mostCompetitive(nums, k));
    }
}