package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_BreakAPalindromeTest {

    private final Problem23_BreakAPalindrome testObject = new Problem23_BreakAPalindrome();

    @Test
    void testBreakPalindrome() {
        String palindrome = "abccba";
        assertEquals("aaccba", testObject.breakPalindrome(palindrome));

        palindrome = "a";
        assertEquals("", testObject.breakPalindrome(palindrome));

        palindrome = "aa";
        assertEquals("ab", testObject.breakPalindrome(palindrome));

        palindrome = "aba";
        assertEquals("abb", testObject.breakPalindrome(palindrome));
    }
}