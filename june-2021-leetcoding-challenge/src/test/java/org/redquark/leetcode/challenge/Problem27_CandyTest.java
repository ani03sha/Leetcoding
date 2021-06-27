package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_CandyTest {

    private final Problem27_Candy testObject = new Problem27_Candy();

    @Test
    void testCandy() {
        int[] ratings = new int[]{1, 0, 2};
        assertEquals(5, testObject.candy(ratings));

        ratings = new int[]{1, 2, 2};
        assertEquals(4, testObject.candy(ratings));
    }
}