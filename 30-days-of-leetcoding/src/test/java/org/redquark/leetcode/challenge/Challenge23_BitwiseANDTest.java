package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge23_BitwiseANDTest {

    private final Challenge23_BitwiseAND testObject = new Challenge23_BitwiseAND();

    @Test
    void rangeBitwiseAnd() {
        assertEquals(4, testObject.rangeBitwiseAnd(5, 7));
        assertEquals(261, testObject.rangeBitwiseAnd(5423, 325));
    }
}