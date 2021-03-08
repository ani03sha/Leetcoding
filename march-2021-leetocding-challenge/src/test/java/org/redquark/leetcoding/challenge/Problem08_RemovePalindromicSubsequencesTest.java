package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_RemovePalindromicSubsequencesTest {

    private final Problem08_RemovePalindromicSubsequences testObject =
            new Problem08_RemovePalindromicSubsequences();

    @Test
    void removePalindromeSub() {
        String s = "ababa";
        assertEquals(1, testObject.removePalindromeSub(s));

        s = "abb";
        assertEquals(2, testObject.removePalindromeSub(s));

        s = "baabb";
        assertEquals(2, testObject.removePalindromeSub(s));

        s = "";
        assertEquals(0, testObject.removePalindromeSub(s));
    }
}