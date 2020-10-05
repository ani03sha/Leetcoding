package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_ComplementOfBase10IntegerTest {

    private final Problem05_ComplementOfBase10Integer testObject = new Problem05_ComplementOfBase10Integer();

    @Test
    void testBitwiseComplement() {
        assertEquals(2, testObject.bitwiseComplement(5));
        assertEquals(0, testObject.bitwiseComplement(7));
        assertEquals(5, testObject.bitwiseComplement(10));
    }
}