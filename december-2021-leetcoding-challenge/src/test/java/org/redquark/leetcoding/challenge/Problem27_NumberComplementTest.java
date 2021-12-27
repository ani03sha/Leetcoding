package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_NumberComplementTest {

    private final Problem27_NumberComplement testObject = new Problem27_NumberComplement();

    @Test
    void testFindComplement() {
        assertEquals(2, testObject.findComplement(5));
        assertEquals(0, testObject.findComplement(1));
    }
}