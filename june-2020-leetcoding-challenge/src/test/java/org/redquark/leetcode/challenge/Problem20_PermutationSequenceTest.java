package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_PermutationSequenceTest {

    private final Problem20_PermutationSequence testObject = new Problem20_PermutationSequence();

    @Test
    void testGetPermutation() {
        assertEquals("213", testObject.getPermutation(3, 3));
        assertEquals("2314", testObject.getPermutation(4, 9));
    }
}