package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_CountVowelsPermutationTest {

    private final Problem04_CountVowelsPermutation testObject = new Problem04_CountVowelsPermutation();

    @Test
    void testCountVowelPermutation() {
        assertEquals(5, testObject.countVowelPermutation(1));
        assertEquals(10, testObject.countVowelPermutation(2));
        assertEquals(68, testObject.countVowelPermutation(5));
    }
}