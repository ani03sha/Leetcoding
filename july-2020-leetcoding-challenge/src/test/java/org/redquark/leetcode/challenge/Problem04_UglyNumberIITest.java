package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_UglyNumberIITest {

    private final Problem04_UglyNumberII testObject = new Problem04_UglyNumberII();

    @Test
    void testNthUglyNumber() {
        assertEquals(5832, testObject.nthUglyNumber(150));
        assertEquals(2123366400, testObject.nthUglyNumber(1690));
    }
}