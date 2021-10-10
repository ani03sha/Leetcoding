package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_BitwiseANDOfNumbersRangeTest {

    private final Problem10_BitwiseANDOfNumbersRange testObject = new Problem10_BitwiseANDOfNumbersRange();

    @Test
    void testRangeBitwiseAnd() {
        assertEquals(4, testObject.rangeBitwiseAnd(5, 7));
        assertEquals(0, testObject.rangeBitwiseAnd(0, 0));
        assertEquals(0, testObject.rangeBitwiseAnd(1, 2147483647));
    }
}