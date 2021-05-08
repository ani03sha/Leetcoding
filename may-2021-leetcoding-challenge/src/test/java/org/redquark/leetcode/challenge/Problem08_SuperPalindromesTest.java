package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_SuperPalindromesTest {

    private final Problem08_SuperPalindromes testObject = new Problem08_SuperPalindromes();

    @Test
    void testSuperPalindromesInRange() {

        String left = "4";
        String right = "1000";
        assertEquals(4, testObject.superPalindromesInRange(left, right));

        left = "1";
        right = "2";
        assertEquals(1, testObject.superPalindromesInRange(left, right));

        left = "1";
        right = "1000000000000000000";
        assertEquals(70, testObject.superPalindromesInRange(left, right));
    }
}