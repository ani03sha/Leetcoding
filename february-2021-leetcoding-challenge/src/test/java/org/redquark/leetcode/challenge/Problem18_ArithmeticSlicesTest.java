package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_ArithmeticSlicesTest {

    private final Problem18_ArithmeticSlices testObject = new Problem18_ArithmeticSlices();

    @Test
    void testNumberOfArithmeticSlices() {
        int[] A = {1, 2, 3, 4};
        assertEquals(3, testObject.numberOfArithmeticSlices(A));
    }
}