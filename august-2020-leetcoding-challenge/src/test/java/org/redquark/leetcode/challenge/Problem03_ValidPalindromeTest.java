package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem03_ValidPalindromeTest {

    private final Problem03_ValidPalindrome testObject = new Problem03_ValidPalindrome();

    @Test
    void testIsPalindrome() {
        assertTrue(testObject.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(testObject.isPalindrome("race a car"));
    }
}