package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_PalindromicSubstringsTest {

    private final Problem27_PalindromicSubstrings testObject = new Problem27_PalindromicSubstrings();

    @Test
    void testCountSubstrings() {
        assertEquals(3, testObject.countSubstrings("abc"));
        assertEquals(6, testObject.countSubstrings("aaa"));
    }
}