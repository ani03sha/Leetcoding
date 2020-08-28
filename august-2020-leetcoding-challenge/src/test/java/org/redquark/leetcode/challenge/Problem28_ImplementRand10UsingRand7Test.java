package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem28_ImplementRand10UsingRand7Test {

    private final Problem28_ImplementRand10UsingRand7 testObject = new Problem28_ImplementRand10UsingRand7();

    @Test
    void testRand10() {
        assertTrue(testObject.rand10() >= 1 && testObject.rand10() <= 10);
    }
}