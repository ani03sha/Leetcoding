package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_NumberComplementTest {

    private final Problem04_NumberComplement testObject = new Problem04_NumberComplement();

    @Test
    void testFindComplement() {
        assertEquals(2, testObject.findComplement(5));
        assertEquals(0, testObject.findComplement(7));
        assertEquals(7, testObject.findComplement(8));
    }
}